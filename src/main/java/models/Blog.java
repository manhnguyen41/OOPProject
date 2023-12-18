package models;

import java.util.ArrayList;
import java.util.List;

public class Blog extends Post{
    // Attribute
    private String description;
    private String collection;

    // Constructor
    public Blog(String title, String description, String link, String collection) {
        super(title, link);
        this.description = description;
        this.collection = collection;
        calculateReact();
    }

    // Method to calculate react
    public void calculateReact() {
        setReact(0);
    }

    // Getter and Setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
}
