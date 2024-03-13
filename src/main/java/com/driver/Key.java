package com.driver;

public class Key {
    private int id;
    private String type;
    private String description;

    public Key(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public int getId() {
    	//your code goes here
        return id;
    }

    public String getType() {
    	//your code goes here
        return type;
    }

    public String getDescription() {
    	//your code goes here
        return description;
    }
}

