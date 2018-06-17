package com.dharma.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Coldwarm on 18/6/17.
 */
@Document
public class Feedback {

    @Id
    private String id;
    private String name;
    private String age;
    public Feedback(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String comment;
    private Date creationDate = new Date();
    private Map<String,String> selections = new HashMap<>();



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, String> getSelections() {
        return selections;
    }

    public void setSelections(Map<String, String> selections) {
        this.selections = selections;
    }
}
