package models;

public class Blog {
    private String title;
    private String info;
    private String img;
    private String description;
    private String link;

    public Blog() {
    }

    public Blog(String title, String info, String img, String description, String link) {
        this.title = title;
        this.info = info;
        this.img = img;
        this.description = description;
        this.link = link;
    }
}
