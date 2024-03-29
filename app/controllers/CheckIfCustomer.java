package controllers;
import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import models.users.*;
/* - Docs -
https://alexgaribay.com/2014/06/16/authentication-in-play-framework-using-java/
https://www.playframework.com/documentation/2.2.x/JavaActionsComposition
*/
// Check if this is an admin user (before permitting an action)
public class CheckIfCustomer extends Action.Simple {
    // Functional Java which is executed concurrently
    // Promise represents a handle for the future result
    // Http.Context contains the current request - which will be allowed
    // only if the conditions here are met
    public CompletionStage<Result> call(Http.Context ctx) {
        // Check if current user (in session) is an admin
        String id = ctx.session().get("username");
        if (id != null) {
            User u = User.getUserById(id);
            if ("admin".equals(u.getRole())) {
                // User admin sp continue with the http request
                return delegate.call(ctx);
            }
        }
        //Result unauthorized = Results.unauthorized("unauthorized");
        // Unauthorised - redirect to login page
        ctx.flash().put("error", "Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}