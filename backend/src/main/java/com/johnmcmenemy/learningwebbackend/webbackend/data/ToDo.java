package com.johnmcmenemy.learningwebbackend.webbackend.data;

import org.springframework.data.annotation.Id;

public class ToDo {

    // ID should only be touched by the framework
    @Id
    private String id;
    // Title and Completed set by the user
    private String title;
    private Boolean completed;

    public ToDo(String title, Boolean completed){
        this.title = title;
        this.completed = completed;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public Boolean getCompleted(){
        return completed;
    }
}
