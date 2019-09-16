package models;

import java.text.*;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;


@Entity

public class SubmittedWork extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private Long rating;

    @Column(columnDefinition = "TEXT")
    @Constraints.Required
    private String text;

    @Constraints.Required
    private String type;

    Date date;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="work_upvoteuser")
    List<User> upvoteUsers;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="work_downvoteuser")
    List<User> downvoteUsers;
    
    @ManyToMany(cascade = CascadeType.ALL, mappedBy ="content")
    private List<Genre> Genre;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
    private List<Comment> comments;

    private List<Long> genreSelect = new ArrayList<Long>();

    public SubmittedWork() {
    }

    public SubmittedWork(Long id,String name,Long rating, String text, String type, User user,List<Comment> comments, List<User> upvoteUsers, List<User> downvoteUsers) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.text = text;
        this.type = type;
        this.user = user;
        this.comments = comments;
        this.upvoteUsers = upvoteUsers;
        this.downvoteUsers = downvoteUsers;
    }

    public static final Finder<Long, SubmittedWork> find = new Finder<>(SubmittedWork.class);
			    
public static final List<SubmittedWork> findAll() {
   return SubmittedWork.find.all();
}

public Date getDate(){
    return this.date;
}

public String getDateString(){
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    
    String d = simpleDateFormat.format(this.date);
    return d;
}

public void setDate(Date date){
    this.date = date;
}

public static List<SubmittedWork> findAll(String filter){
    return SubmittedWork.find.query().where()
        .ilike("name", "%" + filter + "%")
        .orderBy("name asc")
        .findList();
}

public static List<SubmittedWork> findFilter(Long catID, String filter){
    return SubmittedWork.find.query().where()
        .eq("Genre.id", catID)
        .ilike("name", "%" + filter + "%")
        .orderBy("name asc")
        .findList();

}

    public List<Comment> getComments(){
        return this.comments;
}

public void setComments(List<Comment> comments){
    this.comments = comments;
}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
public String getName(){
return this.name;
}
public void setName(String name){
    this.name = name;
}

public List<Long> getGenreSelect(){
    return genreSelect;
}
public void setGenreSelect(List<Long> genreSelect){
    this.genreSelect = genreSelect;
}


public List<Genre> getGenre() {
    return Genre;
}
public void setGenre(List<Genre> Genre) {
    this.Genre = Genre;
}

public String getType(){
    return this.type;
}

public void setType(String type){
    this.type = type;
}

public void setUser(User user){
    this.user = user;
}

public User getUser(){
    return this.user;
}
public Long getRating(){
    return this.rating;
}
public void setRating(Long rating){
    this.rating = rating;
}

public void upvote(User u){
    if(downvoteUsers.contains(u)){
        rating +=2;
        downvoteUsers.remove(u);
        upvoteUsers.add(u);
    }
        else if (!upvoteUsers.contains(u)){
    rating++;
    upvoteUsers.add(u);

}
}
public void downvote(User u){
    if(upvoteUsers.contains(u)){
        rating -=2;
        upvoteUsers.remove(u);
        downvoteUsers.add(u);
    }
        else if (!downvoteUsers.contains(u)){
    rating--;
    downvoteUsers.add(u);
    }

}

public List<User> getUpvoteUsers(){
    return upvoteUsers;
}
public List<User> getDownvoteUsers(){
    return downvoteUsers;
}

public void setUpvoteUsers(List<User> users){
this.upvoteUsers = users;
}
public void setDownvoteUsers(List<User> users){
    this.downvoteUsers = users;
    }


public void addComment(Comment c){
    if(!comments.contains(c)){
    comments.add(c);}
}
}