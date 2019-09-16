package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Genre extends Model {

   @Id
   private Long id;

   @Constraints.Required
   private String name;

   @ManyToMany(cascade = CascadeType.ALL)
   private List<SubmittedWork> content;

   public  Genre() {
   }
			    
   public  Genre(Long id, String name, List<SubmittedWork> content) {
      this.id = id;
      this.name = name;
      this.content = content;
   }
   public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public List<SubmittedWork> getContent() {
    return content;
}

public void setContent (List<SubmittedWork> content) {
    this.content = content;
}

public static Finder<Long,Genre> find = new Finder<Long,Genre>(Genre.class);

public static List<Genre> findAll() {
   return Genre.find.query().where().orderBy("name asc").findList();
}

public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap();
 
    for (Genre g: Genre.findAll()) {
       options.put(g.getId().toString(), g.getName());
    }
    return options;
 }

 public static boolean inGenre(Long genre, Long item){
     return find.query().where().eq("content.id", item)
     .eq("id",genre)
     .findList().size() > 0;
 }

}