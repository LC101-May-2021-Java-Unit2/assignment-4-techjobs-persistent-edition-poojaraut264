package org.launchcode.techjobs.persistent.models;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty(message="Description cannot be blank!")
    @Size(max=250,message="Description is too long! Please enter up to 250 characters.")
    private String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}