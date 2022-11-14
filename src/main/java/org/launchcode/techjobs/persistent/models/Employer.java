package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(max = 100)
    private String location;
//below:Use the @OneToMany and @JoinColumn annotations on the jobs list in Employer to declare the relationship between
// data tables. Recall that this annotation needs a name parameter. What should its value be?
//    formally name="employer_id"
    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();
    public Employer() {
    }
    public String getLocation() {
        return location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
