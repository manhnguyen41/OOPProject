package models;

public class Blog {
    private String title;
    private String description;
    private String link;
    private String collection;

    public Blog() {
    }

    public Blog(String title, String description, String link, String collection) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.collection = collection;
    }
}
