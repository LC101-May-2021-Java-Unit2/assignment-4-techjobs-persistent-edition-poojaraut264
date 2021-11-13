package org.launchcode.techjobs.persistent.models;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty(message="Description cannot be blank!")
    @Size(max=100,message="Description is too long! Please enter up to 100 characters.")
    private String description;

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}