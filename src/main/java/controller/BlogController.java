package controller;

import models.Blog;
import models.Collection;

import java.util.ArrayList;
import java.util.List;

public class BlogController {
    // Static method to get list of Blog by Collection
    public static List<Blog> getBlogByCollection(List<Blog> blogList, Collection collection){
        List<Blog> filteredBlog = new ArrayList<Blog>();
        for (Blog blog: blogList){
            if(blog.getCollection().equals(collection.getName())){
                filteredBlog.add(blog);
            }
        }
        return filteredBlog;
    }
}
