package controllers;

import play.mvc.*;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;


 
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;

    @Inject
    public HomeController(FormFactory f, Environment e) {
        this.formFactory = f;
        this.e = e;
}

public Result shop(String filter) {
    List<PhysWorks> itemList = PhysWorks.findAll(filter);
    return ok(shop.render(itemList, filter, User.getUserById(session().get("username")),e));
   }
   

public Result index(){
    return redirect(routes.HomeController.works(0, ""));
}

			
public Result profile(String uid) {
    
    Form<Bio> bioForm = formFactory.form(Bio.class);
    User u = User.getUserById(uid);
    return ok(profile.render(bioForm,u, User.getUserById(session().get("username")),e));
}

public Result addPhys(){
    Form<PhysWorks> itemForm = formFactory.form(PhysWorks.class);
    return ok(addPhysBook.render(itemForm,User.getUserById(session().get("username"))));
}

@Security.Authenticated(Secured.class)
@Transactional
public Result addPhysSubmit(String filter){
    Form<PhysWorks> newItemForm = formFactory.form(PhysWorks.class).bindFromRequest();

    if (newItemForm.hasErrors()){
        return badRequest(addPhysBook.render(newItemForm,User.getUserById(session().get("username"))));
    }else{
        PhysWorks newPhys = newItemForm.get();
        if(newPhys.getId() == null){
            
            newPhys.save();

            
        } else {

            newPhys.update();

        }
                MultipartFormData<File> data = request().body().asMultipartFormData();
       
        FilePart<File> image = data.getFile("upload");
        
        String saveImageMessage = saveFile(newPhys.getId(), image);
        flash("success", "The book " + newPhys.getName() + " was updated/added to the shop.");

               return redirect(controllers.routes.HomeController.shop(filter));
    }
}

public Result deleteBook(Long id, String filter) {
    PhysWorks.find.ref(id).delete();

    flash("success", "Book has been deleted from shop page.");
        return redirect(controllers.routes.HomeController.shop(filter));
}

public Result updateBook(Long id) {
    PhysWorks i;
    Form<PhysWorks> itemForm;

    try{
        i = PhysWorks.find.byId(id);

        itemForm = formFactory.form(PhysWorks.class).fill(i);
    } catch (Exception ex) {
        return badRequest("error");
    }

    return ok(addPhysBook.render(itemForm, User.getUserById(session().get("username"))));
}



public Result fullWork(Long id){
    SubmittedWork work = null;
    work = SubmittedWork.find.byId(id);
    List<Comment> comments = work.getComments();
    Form<Comment> itemForm = formFactory.form(Comment.class);
    Form<Donation> donationForm = formFactory.form(Donation.class);
    User donation = null;
    return ok(fullWork.render(donationForm, itemForm, comments, work, User.getUserById(session().get("username")),e));
}

    public Result works(Long cat, String filter) {
        List<SubmittedWork> itemList = null;
        List<Genre> GenreList = Genre.findAll();

        if(cat ==0){
        
            itemList = SubmittedWork.findAll(filter);
        }else {
            itemList = SubmittedWork.findFilter(cat, filter);
        }
        return ok(works.render(itemList, GenreList, cat, filter, User.getUserById(session().get("username")),e));

     }


    public Result curated() {
        List<SubmittedWork> itemList = null;
        itemList = SubmittedWork.findAll();
 
        return ok(curated.render(itemList,User.getUserById(session().get("username")),e));

    }

    @Security.Authenticated(Secured.class)
    public Result addSubmission() {
        Form<SubmittedWork> itemForm = formFactory.form(SubmittedWork.class);
        return ok(addSubmission.render(itemForm,User.getUserById(session().get("username"))));
}
@Security.Authenticated(Secured.class)
@Transactional
public Result addSubmissionSubmit() {

    Form<SubmittedWork> newItemForm = formFactory.form(SubmittedWork.class).bindFromRequest();

    if (newItemForm.hasErrors()) {

        return badRequest(addSubmission.render(newItemForm,User.getUserById(session().get("username"))));
    } else {
        SubmittedWork newItem = newItemForm.get();

        List<Genre> newGenres = new ArrayList<Genre>();
        for (Long genre : newItem.getGenreSelect()){
            newGenres.add(Genre.find.byId(genre));
        }
        newItem.setGenre(newGenres);

        if(newItem.getId()==null){
        newItem.save();

        }else{
            newItem.update();
        }
     
        MultipartFormData<File> data = request().body().asMultipartFormData();
       
        FilePart<File> image = data.getFile("upload");
        
        String saveImageMessage = saveFile(newItem.getId(), image);


        flash("success", "Your work was added/updated.");

        return redirect(controllers.routes.HomeController.drafts());
    }
}

@Security.Authenticated(Secured.class)
@Transactional
public Result addCommentSubmit(Long wid) {

    Form<Comment> newItemForm = formFactory.form(Comment.class).bindFromRequest();

    if (newItemForm.hasErrors()) {

        return redirect(controllers.routes.HomeController.works(0,""));
        } else {
        Comment newItem = newItemForm.get();

        if(newItem.getId()==null){
        SubmittedWork s = SubmittedWork.find.byId(wid);
        User u = User.getUserById(session().get("username"));
        newItem.setUser(u);
        newItem.setWork(s);
        newItem.save();

        }else{
            newItem.update();
        }

        flash("success", "Comment successfully posted");

        return redirect(controllers.routes.HomeController.fullWork(wid));
    }
}

@Security.Authenticated(Secured.class)
@Transactional
public Result addDonationSubmit(Long id,String uid) {

Form<Donation> newDonationForm = formFactory.form(Donation.class).bindFromRequest();

    User user = User.getUserById(uid);
    Donation newDonation = newDonationForm.get();

    if(newDonation.getId()==null){
        newDonation.save();
        user.setDonation(newDonation);
        user.update();
        
    }else{
        newDonation.update();
    }

    flash("success", "Donation submitted");

    return redirect(controllers.routes.HomeController.fullWork(id));
}

@Security.Authenticated(Secured.class)
@Transactional
public Result addBioSubmit(String uid) {

Form<Bio> newBioForm = formFactory.form(Bio.class).bindFromRequest();

    User user = User.getUserById(uid);
    if(newBioForm.hasErrors()){
        flash("error", "error text");
               return redirect(controllers.routes.HomeController.profile(uid));
    } else {
    Bio newBio = newBioForm.get();

    if(newBio.getId()==null){
        newBio.save();
        user.setBio(newBio);
        user.update();
        
    }else{
        newBio.update();
    }

    flash("success", "Bio submitted");

        return redirect(controllers.routes.HomeController.profile(uid));
    }
}


public String saveFile(Long id, FilePart<File> uploaded) {
    if (uploaded != null) {
        String mimeType = uploaded.getContentType();
        if (mimeType.startsWith("image/")) {
            String fileName = uploaded.getFilename();
            String extension = "";
            int i = fileName.lastIndexOf('.');
            if (i >= 0) {
                extension = fileName.substring(i + 1);
            }
            File file = uploaded.getFile();

            File dir = new File("public/images/productImages");
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File newFile = new File("public/images/productImages/", id + "." + extension);
            if (file.renameTo(newFile)) {
                try {
                    BufferedImage img = ImageIO.read(newFile); 
                    BufferedImage scaledImg = Scalr.resize(img, 120);
                    
                    if (ImageIO.write(scaledImg, extension, new File("public/images/productImages/", id + "thumb.jpg"))) {
                        return "/ file uploaded and thumbnail created.";
                    } else {
                        return "/ file uploaded but thumbnail creation failed.";
                    }
                } catch (IOException e) {
                    return "/ file uploaded but thumbnail creation failed.";
                }
            } else {
                return "/ file upload failed.";
            }
        }
    }
    return "/ no image file.";
}


@Security.Authenticated(Secured.class)
@Transactional
@With(AuthAdmin.class)
public Result deleteItem(Long id) {

    SubmittedWork.find.ref(id).delete();

    flash("success", "Item has been deleted.");
    return redirect(controllers.routes.HomeController.works(0,""));
}

@Security.Authenticated(Secured.class)
public Result updateItem(Long id) {
    SubmittedWork i;
    Form<SubmittedWork> itemForm;

    try {
        i = SubmittedWork.find.byId(id);

        itemForm = formFactory.form(SubmittedWork.class).fill(i);
    } catch (Exception ex) {
        return badRequest("error");
    }

    return ok(addSubmission.render(itemForm,User.getUserById(session().get("username"))));
}

@Security.Authenticated(Secured.class)
@Transactional
@With(AuthAdmin.class)

public Result addToCurated(Long id) {

    SubmittedWork i;
    i = SubmittedWork.find.byId(id);
    i.setType("c");
    i.save();
    i.update();

    flash("success", " work added to the Curated page");
    return redirect(controllers.routes.HomeController.curated());
}

@Security.Authenticated(Secured.class)
@Transactional
public Result upvote(Long id,String username){
    SubmittedWork s = SubmittedWork.find.byId(id);
    User u = User.getUserById(username);
    s.upvote(u); 
    s.update();
    return redirect(controllers.routes.HomeController.fullWork(id));
}

@Security.Authenticated(Secured.class)
@Transactional
public Result downvote(Long id,String username){
    SubmittedWork s = SubmittedWork.find.byId(id);
    User u = User.getUserById(username);
    s.downvote(u); 
    s.update();

    return redirect(controllers.routes.HomeController.fullWork(id));
}

@Security.Authenticated(Secured.class)
public Result drafts(){
    
    List<SubmittedWork> itemList = null;
    itemList = SubmittedWork.findAll();
 
    return ok(drafts.render(itemList,User.getUserById(session().get("username")),e));
}

public Result addToPublished(Long id, Long cat, String filter) {
    
    SubmittedWork i;
    i = SubmittedWork.find.byId(id);
    i.setDate(Calendar.getInstance().getTime());
    i.setType("p");
    i.save();
    i.update();

    flash("success", "Work added to the Main page");
    return redirect(controllers.routes.HomeController.works(cat, filter));
}

@Security.Authenticated(Secured.class)
@Transactional
@With(AuthAdmin.class)
public Result deleteComment(Long id) {

    SubmittedWork s = Comment.find.ref(id).getWork();
    Comment.find.ref(id).delete();

    flash("success", "Comment has been deleted.");
    return redirect(controllers.routes.HomeController.fullWork(s.getId()));
}

@Security.Authenticated(Secured.class)
@With(AuthAdmin.class)
public Result users(){

   List<User> userList = null;
   userList = User.findAll();

   return ok(users.render(userList,User.getUserById(session().get("username"))));  
}

}
