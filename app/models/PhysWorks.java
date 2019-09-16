package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;


@Entity
public class PhysWorks extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private Float price;

    @Constraints.Required
    private String author;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int stock;

    @ManyToOne
    private User user;

    public PhysWorks (){

    }

    public PhysWorks(Long id, String name, Float price, String author, String description, int stock, User user){
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.description = description;
        this.stock = stock;
        this.user = user;
}

    public static final Finder<Long, PhysWorks> find = new Finder<>(PhysWorks.class);

    public static List<PhysWorks> findAll(String filter) {
        return PhysWorks.find.query().where()
            .ilike("name", "%" + filter + "%")
            .orderBy("name asc")
            .findList();
    }

          public void setUser(User user){
    this.user = user;
}
public User getUser(){
    return this.user;
}


    
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Float getPrice(){
        return price;
    }

    public void setPrice(Float price){
        this.price = price;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

        public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void decrementStock(){
    stock-=1;
}

public void incrementStock(){
    stock+=1;
}
public void incrementStock(int q){
    stock+=q;
}

}