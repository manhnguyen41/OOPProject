package controller;

import connector.RedditPostConnector;
import models.RedditPost;
import var.GlobalVar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class RedditPostComparatorASC implements Comparator<RedditPost> {
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

public class ListOfRedditPosts {
    // Attribute
    private List<RedditPost> redditPostList;
    public static final Comparator<RedditPost> COMPARE_REDDIT_POST_BY_REACT_ASC =
            new RedditPostComparatorASC();
    public static final Comparator<RedditPost> COMPARE_REDDIT_POST_BY_REACT_DES =
            new RedditPostComparatorDES();

    // Constructor
    public ListOfRedditPosts() {
        redditPostList = RedditPostConnector.readRedditPostsFromJson(
                GlobalVar.path + "/RedditPost.json");
    }

    //Sort by react ascending
    public  void sortByPostReactASC(){
        redditPostList.sort(COMPARE_REDDIT_POST_BY_REACT_ASC);
    }
    //Sort by react descending
    public  void sortByPostReactDES(){
        redditPostList.sort(COMPARE_REDDIT_POST_BY_REACT_DES);
    }

    // Method to get list of RedditPost by keyword
    public List<RedditPost> getRedditPostByKeyWord(String keyWord){
        List<RedditPost> filteredListRedditPost = new ArrayList<>();
        for(RedditPost redditPost: redditPostList){
            if(redditPost.getKeyword().equals(keyWord) && redditPost.check(keyWord)){
                filteredListRedditPost.add(redditPost);
            }
        }
        return filteredListRedditPost;
    }

    // ------ SEARCH BY TITLE ------
    public List<RedditPost> getRedditPostByTitle(String title){
        List<RedditPost> filteredList = new ArrayList<>();
        for(RedditPost redditPost: redditPostList){
            if(redditPost.getTitle().equals(title)){
                filteredList.add(redditPost);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<RedditPost> getRedditPostList() {
        return redditPostList;
    }

    public void setRedditPostList(List<RedditPost> redditPostList) {
        this.redditPostList = redditPostList;
    }
}
