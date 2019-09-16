package controllers;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;
import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;
// Import models
import models.users.*;
import models.shopping.*;
import models.*;
@Security.Authenticated(Secured.class)
// Authorise user (check if user is a customer)
@With(CheckIfCustomer.class)
public class ShoppingCtrl extends Controller {
    private FormFactory formFactory;
    private Environment env;
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }
    // View an individual order
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render((User)User.getUserById(session().get("username")), order));
    }
    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {
        
        // Find the item on sale
        PhysWorks physworks = PhysWorks.find.byId(id);
        
        // Get basket for logged in customer
        User user = (User)User.getUserById(session().get("username"));
        
        // Check if item in basket
        if (user.getBasket() == null) {
            // If no basket, create one
            user.setBasket(new Basket());
            user.getBasket().setUser(user);
            user.update();
        }
        // Add product to the basket and save
        user.getBasket().addPhys(physworks);
        user.update();

        physworks.decrementStock();
        physworks.update();
        
        // Show the basket contents     
        return ok(basket.render(user));
    }
    @Transactional
    public Result emptyBasket() {
        
        User u = (User)User.getUserById(session().get("username"));
        u.getBasket().removeAllItems();
        u.getBasket().update();
        
        return ok(basket.render(u));
    }
    @Transactional
    public Result placeOrder() {
        User u = (User)User.getUserById(session().get("username"));
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setUser(u);
        
        // Copy basket to order
        order.setItems(u.getBasket().getBasketItems());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderItem i: order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        u.getBasket().setBasketItems(null);
        u.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(u, order));
    }
    @Transactional
    public Result showBasket() {
        return ok(basket.render((User)User.getUserById(session().get("username"))));
    }
    // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId, Long pid) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);

        PhysWorks ios = PhysWorks.find.byId(pid);
        if(ios.getStock()>0){
        // Increment quantity
        item.increaseQty();
        // Save
        item.update();
        ios.decrementStock();
        ios.update();
        }else{
            flash("error", "Sorry, no more of these items left");
        }
        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }
    @Transactional
    public Result removeOne(Long itemId,Long pid) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);

        PhysWorks ios = PhysWorks.find.byId(pid);
        // Get user
        User u = (User)User.getUserById(session().get("username"));
        // Call basket remove item method
        u.getBasket().removeItem(item,ios);
        u.getBasket().update();
        // back to basket
        return ok(basket.render(u));
    }
}