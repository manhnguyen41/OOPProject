package connector;

import com.google.gson.reflect.TypeToken;
import models.Blog;
import models.RedditPost;


import java.util.List;

public class RedditPostConnector extends Connector{
    // Static method to read Blogs from json file
    public static List<RedditPost> readRedditPostsFromJson(String path) {
        List<RedditPost> redditPostList = readFromJson(path, new TypeToken<List<RedditPost>>(){}.getType());
        for (RedditPost redditPost: redditPostList) {
            redditPost.calculateReact();
        }
        return redditPostList;
    }
}
