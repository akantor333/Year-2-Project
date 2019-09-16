package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.shopping.*;

import java.text.*;


@Entity
@Table (name = "user")

public class User extends Model {
    @Id
    private String username;

    @Constraints.Required 
    private String role;

    @Constraints.Required 
    private String email;

    @Constraints.Required
    private String name;
    
    @Constraints.Required
    private String password;

    @Constraints.Required 
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Constraints.Required 
    private String address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SubmittedWork> works;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PhysWorks> items;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments;


    @OneToOne(cascade = CascadeType.ALL)
    Donation donation;

    @OneToOne(cascade = CascadeType.ALL)
    Bio bio;

    @OneToOne(mappedBy="user", cascade = CascadeType.ALL)
    private Basket basket;

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

    public static final Finder<Long, User> find = new Finder<>(User.class);

    public static final List<User> findAll(){
        return User.find.all();
    }

    public static User authenticate(String username, String password) {
        return find.query().where().eq("username", username).eq("password", password).findUnique();
    }
    public static User getUserById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("username", id).findUnique();
        }
    }

    public User() {
    }

    public User(String username, String role, String email, String name, String password, Date birthday, String address, Bio bio, List<SubmittedWork> works, List<Comment> comments, Donation donation) {
        this.username = username;
        this.role = role;
        this.email = email;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.bio = bio;
        this.works = works;
        this.comments = comments;
        this.donation = donation;
    }

    public Bio getBio(){
    return bio;
    }

    public void setBio(Bio bio){
    this.bio = bio;
    }

    public Donation getDonation(){
    return donation;
    }

    public void setDonation(Donation donation){
    this.donation = donation;
    }
    public List<Comment> getComments() {
        return this.comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday(){
        return birthday;
    }

    public String getBirthdayString(){
        return String.format("%1$td %1$tB %1$tY", birthday);
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setWorks(List<SubmittedWork> works){
        this.works = works;
    }

    public List<SubmittedWork> getWorks(){
        return works;
    }

       public void setItems(List<PhysWorks> items){
        this.items = items;
    }
    public List<PhysWorks> getItems(){
        return items;
    }
    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
    public List<ShopOrder> getOrders() {
        return orders;
    }
    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

    public void addWork(SubmittedWork work){
        works.add(work);
    }

    public void addComment(Comment c){
        if(!comments.contains(c)){
        comments.add(c);}
    }

    public String getDateString(){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        String d = simpleDateFormat.format(this.birthday);
        return d;
    }

}