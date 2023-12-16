package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.KeyWord;
import models.RedditPost;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class RedditPostController {
    // Static method to get list of RedditPost by keyword
    public static List<RedditPost> getRedditPostByKeyWord(List<RedditPost> listRedditPost, String keyWord){
        List<RedditPost> filteredListRedditPost = new ArrayList<>();
        for(RedditPost redditPost: listRedditPost){
            if(redditPost.getKeyword().equals(keyWord) && check(keyWord, redditPost)){
                filteredListRedditPost.add(redditPost);
            }
        }
        return filteredListRedditPost;
    }

    // Method to check if post contain the keyword
    public static boolean check(String keyWord, RedditPost redditPost) {
        return redditPost.getTitle().contains(keyWord) || redditPost.getSumContent().contains(keyWord);
    }
}
