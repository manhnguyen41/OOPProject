package controllers.listController;

import connectors.RedditPostConnector;
import controllers.comparatorcontroller.redditpostcomparator.RedditPostComparatorByReact;
import models.RedditPost;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfRedditPosts implements Searchable<RedditPost> {
    // Attribute
    private List<RedditPost> redditPostList;
    public static final Comparator<RedditPost> COMPARE_REDDIT_POST_BY_REACT_ASC =
            new RedditPostComparatorByReact(true);
    public static final Comparator<RedditPost> COMPARE_REDDIT_POST_BY_REACT_DES =
            new RedditPostComparatorByReact(false);

    // Constructor
    public ListOfRedditPosts() {
        redditPostList = RedditPostConnector.readRedditPostsFromJson(
                "data/RedditPost.json");
        for (RedditPost redditPost: redditPostList) {
            redditPost.calculateReact();
        }
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
    public List<RedditPost> search(String title){
        List<RedditPost> filteredList = new ArrayList<>();
        for(RedditPost redditPost: redditPostList){
            if(redditPost.getTitle().toLowerCase().contains(title.toLowerCase())){
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
