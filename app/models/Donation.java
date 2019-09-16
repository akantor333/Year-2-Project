package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;
import models.*;

@Entity
public class Donation extends Model {
    
    @Id
    private Long id;

    @Constraints.Required
    private String donationEmail;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getDonationEmail() {
        return this.donationEmail;
    }

    public void setDonationEmail(String donationEmail) {
        this.donationEmail = donationEmail;
    }

}
