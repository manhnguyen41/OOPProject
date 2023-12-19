package models;

import connector.BlogConnector;

import java.util.ArrayList;
import java.util.List;

public class ListOfBlogs implements Searchable<Blog>{
    // Attribute
    private List<Blog> blogList;

    // Constructor
    public ListOfBlogs() {
        blogList = BlogConnector.readBlogsFromJson(
                "data/Blog.json");
    }

    // Method to search blogs by name
    public List<Blog> search(String title) {
        List<Blog> filteredList = new ArrayList<>();
        for(Blog blog: blogList){
            if(blog.getTitle().equals(title)){
                filteredList.add(blog);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
