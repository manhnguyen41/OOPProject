package connector;

import com.google.gson.reflect.TypeToken;
import models.Blog;
import services.GsonHandler;

import java.lang.reflect.Type;
import java.util.List;

public class BlogConnector{
    // Static method to read Blogs from json file
    public static List<Blog> readBlogsFromJson(String path) {
        GsonHandler gsonHandler = new GsonHandler();
        return gsonHandler.fromJson(path, new TypeToken<List<Blog>>(){}.getType());
    }
}
