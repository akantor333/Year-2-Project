package models.users;
import models.*;
import java.util.*;

public class UserPassword2 extends User {
    private String password2;


    public UserPassword2(){

    }

    public UserPassword2(String username, String role, String email, 
            String name, String password1, Date birthday, String address, Bio bio, List<SubmittedWork> works,List<Comment> comments, String password2,Donation donation) {
        super(username, role ,email, name, password1, birthday, address, bio, works, comments, donation);
        this.password2 = password2;
    }

    public String getPassword2(){
        return password2;
    }

    public void setPassword2(String p){
        this.password2 = p;
    }

}