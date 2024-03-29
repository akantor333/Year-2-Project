package models.shopping;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;
import models.*;
// Product entity managed by Ebean
@Entity
public class Basket extends Model {
    @Id
    private Long id;
    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;
    
    @OneToOne
    private User user;
    
    // Default constructor
    public  Basket() {
    }
    
	
   //Generic query helper
    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);
    //Find all Products in the database
    public static List<Basket> findAll() {
        return Basket.find.all();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
public List<OrderItem> getBasketItems() {
        return basketItems;
    }
    public void setBasketItems(List<OrderItem> basketItems) {
        this.basketItems = basketItems;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    // Add item for sale to basket
    // Either update existing order item or ad a new one.
    public void addPhys(PhysWorks physworks) {
        
        boolean itemFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderItem oi : basketItems) {
            if (oi.getPhysWorks().getId() == physworks.getId()) {
                oi.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            // Add orderItem to list
            OrderItem newItem = new OrderItem(physworks);
            // Add to items
            basketItems.add(newItem);
        }
    }
    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderItem i: basketItems) {
            total += i.getItemTotal();
        }
        return total;
    }
    public void removeItem(OrderItem item, PhysWorks ios) {
        // Using an iterator ensures 'safe' removal of list objects
        // Removal of list items is unreliable as index can change if an item is added or removed elsewhere
        // iterator works with an object reference which does not change
        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                // If more than one of these items in the basket then decrement
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                     ios.incrementStock();
                    ios.update();
                }
                // If only one left, remove this item from the basket (via the iterator)
                else {
                    // delete object from db
                    i.delete();
                    ios.incrementStock();
                    ios.update();
                    // remove object from list
                    iter.remove();
                    break;
                }             
            }
       }
    }
    public void removeAllItems() {
        for(OrderItem i: this.basketItems) {
            PhysWorks ios = PhysWorks.find.byId(i.getPhysWorks().getId());
            if(ios.getId() == i.getPhysWorks().getId())
            {
                int quantity = i.getQuantity();
                ios.incrementStock(quantity);
                ios.update();
            } 
            i.delete();
        }
        this.basketItems = null;
    }
}