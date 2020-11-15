package com.example.springbootjpa.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public Course() {

    }
}
