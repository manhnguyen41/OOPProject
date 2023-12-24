package connectors;

import com.google.gson.reflect.TypeToken;
import models.RedditPost;
import services.GsonHandler;


import java.util.List;

public class RedditPostConnector{
    // Static method to read Reddit Posts from json file
    public static List<RedditPost> readRedditPostsFromJson(String path) {
        GsonHandler gsonHandler = new GsonHandler();
        return gsonHandler.fromJson(path, new TypeToken<List<RedditPost>>(){}.getType());
    }
}
