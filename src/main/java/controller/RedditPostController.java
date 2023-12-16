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

class RedditPostComparatorASC implements Comparator<RedditPost>{
    @Override
    public int compare(RedditPost post1, RedditPost post2){
        return post1.getReact() - post2.getReact();
    }
}

class RedditPostComparatorDES implements Comparator<RedditPost>{
    @Override
    public int compare(RedditPost post1, RedditPost post2){
        return post2.getReact() - post1.getReact();
    }
}

public class RedditPostController {

    public static final Comparator<RedditPost> COMPARE_REDDITPOST_BY_REACT_ASC =
            new RedditPostComparatorASC();
    //sort by react ascending
    public static void sortByPostReactASC(List<RedditPost> listPost){
        listPost.sort(COMPARE_REDDITPOST_BY_REACT_ASC);
    }

    public static final Comparator<RedditPost> COMPARE_REDDITPOST_BY_REACT_DES =
            new RedditPostComparatorDES();
    //sort by react descending
    public static void sortByPostReactDES(List<RedditPost> listPost){
        listPost.sort(COMPARE_REDDITPOST_BY_REACT_DES);
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
