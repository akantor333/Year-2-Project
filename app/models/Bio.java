package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;
import models.*;

@Entity
public class Bio extends Model {
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT")
    @Constraints.Required
    private String text;


    public Bio() {
    }

    public Bio(Long id, String text) {
        this.id = id;
        this.text = text;
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

}