package connector;

import com.google.gson.reflect.TypeToken;
import models.Blog;

import java.lang.reflect.Type;
import java.util.List;

public class BlogConnector extends Connector{
    // Static method to read Blogs from json file
    public static List<Blog> readBlogsFromJson(String path) {
        return readFromJson(path, new TypeToken<List<Blog>>(){}.getType());
    }
}
