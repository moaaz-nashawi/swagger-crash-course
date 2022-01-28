package com.oneoonecode.swaggercrashcourse.models;

public class ToDoItem {
    private String itemId;
    private String title;
    private String description;
    private Boolean completed;

    public ToDoItem(){
        super();
    }

    public ToDoItem(String itemId, String title, String description, Boolean completed) {
        this.itemId = itemId;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public ToDoItem(String title, String description, Boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
