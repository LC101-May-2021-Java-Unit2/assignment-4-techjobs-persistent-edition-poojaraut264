package org.launchcode.techjobs.persistent.models;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message="Location cannot be empty!")
    @Size(max=50,message="Location is too long! Please enter up to 50 characters.")
    private String location;

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
