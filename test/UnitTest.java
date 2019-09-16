import models.*;
import models.users.*;
import akka.actor.ActorSystem;
import controllers.AsyncController;
import controllers.CountController;
import org.junit.*;
import play.mvc.Result;
import scala.concurrent.ExecutionContextExecutor;
import static org.junit.Assert.*;
import java.util.*;
import java.util.Date;

import java.util.concurrent.CompletionStage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static play.test.Helpers.contentAsString;


public class UnitTest {

    User user = new User("admin", "admin", "admin@email.com", "Test", "Test123", null, "Test Address", null, null, null, null);
    SubmittedWork work = new SubmittedWork(new Long(1000),"test",new Long(0), "Test Text", "p", user, null, null, null);
    Comment comment = new Comment(new Long(1000),"Test Comment,!?@");
    Donation donation = new Donation(new Long(1000),"Test@email.com");
    Bio bio = new Bio(new Long(1000),"Test Bio");
    
    @Test
    public void testRating(){
        work.upvote(user);
        assertEquals(new Long(1), work.getRating());
        work.upvote(user);
        assertEquals(new Long(1), work.getRating());
        work.downvote(user);
        assertEquals(new Long(-1), work.getRating());
    }

    @Test
    public void testAddDonation(){
        user.setDonation(donation);
        assertEquals("Test@email.com", user.getDonation().getDonationEmail());
    }

    @Test
    public void testBirthdayDateConversion(){
        Date d = new Date("January 08 1997 12:30");
        user.setBirthday(d);
        assertEquals("08-01-1997", user.getDateString());
    }

    @Test
    public void testAddComment(){
        work.addComment(comment);
        assertTrue(work.getComments().contains(comment));
    }
}
