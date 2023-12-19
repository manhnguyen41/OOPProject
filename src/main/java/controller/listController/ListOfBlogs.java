package controller.listController;

import connector.BlogConnector;
import models.Blog;

import java.util.List;

public class ListOfBlogs {
    // Attribute
    private List<Blog> blogList;

    // Constructor
    public ListOfBlogs() {
        blogList = BlogConnector.readBlogsFromJson(
                "data/Blog.json");
    }

    public Blog getIdentifyingBlog(String title, String description, String link, String collection){
        for (Blog blog: blogList){
            if(blog.getTitle().equals(title)
                    && blog.getDescription().equals(description)
                    && blog.getLink().equals(link)
                    && blog.getCollection().equals(collection) ){
                return blog;
            }
        }
        return null;
    }

    // Getter and Setter
    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
