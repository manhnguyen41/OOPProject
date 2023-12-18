package models;

public abstract class Post {
    // Attribute
    private String title;
    private String link;

    private int react;

    // Constructor
    public Post(String title, String link) {
        this.title = title;
        this.link = link;
    }

    // Method to calculate react
    public abstract void calculateReact();

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getReact() {
        return react;
    }

    public void setReact(int react) {
        this.react = react;
    }
}
