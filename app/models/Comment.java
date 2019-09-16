package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;
import models.*;

@Entity
public class Comment extends Model {
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT")
    @Constraints.Required
    private String text;

    @ManyToOne
    User user;

    @ManyToOne
    SubmittedWork work;


    public Comment() {
    }
    
    public Comment(Long id, String text){
        this.text = text;
        this.id = id;
    }
    public Comment(String text, User user, SubmittedWork work) {
        this.text = text;
        this.user = user;
        this.work = work;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SubmittedWork getWork() {
        return this.work;
    }

    public void setWork(SubmittedWork work) {
        this.work = work;
    }

    public static final Finder<Long, Comment> find = new Finder<>(Comment.class);

}