package controller;

import models.Blog;
import models.Collection;

import java.util.ArrayList;
import java.util.List;

public class BlogController {
    // Static method to get list of Blog by Collection
    public static List<Blog> getBlogByCollection(List<Blog> blogList, String collection){
        List<Blog> filteredBlog = new ArrayList<Blog>();
        for (Blog blog: blogList){
            if(blog.getCollection().equals(collection)){
                filteredBlog.add(blog);
            }
        }
        return filteredBlog;
    }

    public static Blog getIdentifyingBlog(List<Blog> blogList, String title, String description, String link, String collection){
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
}
