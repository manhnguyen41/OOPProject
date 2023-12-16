package controller;


import models.KeyWord;
import models.Post;
import models.RedditPost;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class RedditPostComparator implements Comparator<RedditPost>{
    public RedditPostComparator() {
        super();
    }
    public int compare(RedditPost post1, RedditPost post2){
        return post1.getReact() - post2.getReact();
    }
}

public class RedditPostController {

    public static final Comparator<RedditPost> COMPARE_REDDITPOST_BY_REACT =
            new RedditPostComparator();

    public static void sortByPostReact(List<RedditPost> listPost){
        listPost.sort(COMPARE_REDDITPOST_BY_REACT);
    }
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
