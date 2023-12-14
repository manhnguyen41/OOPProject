package models;

public class RedditPost {
    private String title;
    private String author;
    private String link;
    private String sumContent;
    private int ups;
    private int downs;
    private int numComments;
    private String created;
    private String keyword;

    public RedditPost(String title, String author, String link, String sumContent, int ups, int downs, int numComments, String created, String keyword) {
        this.title = title;
        this.author = author;
        this.link = link;
        this.sumContent = sumContent;
        this.ups = ups;
        this.downs = downs;
        this.numComments = numComments;
        this.created = created;
        this.keyword = keyword;
    }
}



