package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;
import models.users.UserPassword2;

import views.html.*;

public class LoginController extends Controller {
    private FormFactory formFactory;
 
    @Inject
    public LoginController(FormFactory f) {
        this.formFactory = f;
    }
    
    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm,User.getUserById(session().get("username"))));
}
public Result loginSubmit() {
    Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

    if (loginForm.hasErrors()) {
        return badRequest(login.render(loginForm,User.getUserById(session().get("username"))));
    } else {

        session().clear();

        session("username", loginForm.get().getUsername());

        return redirect(controllers.routes.HomeController.works(0, ""));
    }
}
public Result logout() {
    session().clear();
    flash("success", "You have been logged out");
    return redirect(routes.LoginController.login());
}

public Result registerUser() {
    Form<UserPassword2> userForm = formFactory.form(UserPassword2.class);
    return ok(registerUser.render(userForm,User.getUserById(session().get("username"))));
}

public Result registerUserSubmit() {

    Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
    Form<UserPassword2> newUserForm2 = formFactory.form(UserPassword2.class).bindFromRequest();

    if (newUserForm.hasErrors()) {

        return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("username"))));
    } else {

        User  newUser = newUserForm.get();
        UserPassword2 newUser2 = newUserForm2.get();
        
        if(newUser2.getEmail().indexOf('@')<0){
          flash("error", "Not a proper email format");

          return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("username"))));
        }

        if(newUser2.getPassword().length() < 6){
    
            flash("error", "Passwords must be atleast 6 characters "); 
           
            return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("username"))));
        }
        char charVal;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean numVal = false;
            
            for(int i = 0; i <newUser2.getPassword().length(); i++){
                charVal = newUser2.getPassword().charAt(i);
                if(Character.isDigit(charVal)){
                    numVal = true ;
                }
                else if(Character.isUpperCase(charVal)){
                    upperCase = true;
                }
                else if(Character.isLowerCase(charVal)){
                    lowerCase = true;
                }
            }
            if(lowerCase && upperCase && numVal == true){

            }
            else{
                flash("error", "Passwords must contain atlease one number, Upper case character and Lower case character."); 
       
                return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("username"))));  
            }
        

        if(!newUser2.getPassword2().equals(newUser2.getPassword())){
            flash("error", "Passwords must match "); 
           
            return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("username"))));
            
        } 
    
        if(User.getUserById(newUser.getUsername())==null){
            newUser.save();
        }else{
            flash("error", "Username is already taken by another user");

            return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("username"))));
            
        }

    flash("success", "User " + newUser.getName() + " was registered.");

    return redirect(controllers.routes.LoginController.login()); 
    }
}



}