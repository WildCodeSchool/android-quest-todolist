package fr.wildcodeschool.todolist.models;

import java.util.Date;

public class Todo {

    String description;
    Date date;

    public Todo(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
