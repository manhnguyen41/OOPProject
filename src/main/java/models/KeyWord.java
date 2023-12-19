package models;

import java.util.List;

import controller.listController.ListOfRedditPosts;

public class KeyWord {
    // Attribute
    private String word;
    private final int[] react = new int[3];

    // Constructor
    public KeyWord(String word) {
        this.word = word;
    }

    // Method to calculate react of a keyword
    public void calculateReact(ListOfRedditPosts listRedditPost) {
        react[0] = getSumReactByDay(listRedditPost);
        react[1] = getSumReactByMonth(listRedditPost);
        react[2] = getSumReactByYear(listRedditPost);
    }

    // Method to get sum of react of a list of reddit post by day
    public int getSumReactByDay(ListOfRedditPosts listRedditPost) {
        int sumReact = 0;
        List<RedditPost> filteredListRedditPost
                = listRedditPost.getRedditPostByKeyWord(word);
        for (RedditPost redditPost: filteredListRedditPost) {
            if (redditPost.getTimeFrame().equals("day")) {
                sumReact += redditPost.getReact();
            }
        }
        return sumReact;
    }

    // Method to get sum of react of a list of reddit post by month
    public int getSumReactByMonth(ListOfRedditPosts listRedditPost) {
        int sumReact = 0;
        List<RedditPost> filteredListRedditPost
                = listRedditPost.getRedditPostByKeyWord(word);
        for (RedditPost redditPost: filteredListRedditPost) {
            if (redditPost.getTimeFrame().equals("month")
                    || redditPost.getTimeFrame().equals("day")) {
                sumReact += redditPost.getReact();
            }
        }
        return sumReact;
    }

    // Method to get sum of react of a list of reddit post by year
    public int getSumReactByYear(ListOfRedditPosts listRedditPost) {
        int sumReact = 0;
        List<RedditPost> filteredListRedditPost
                = listRedditPost.getRedditPostByKeyWord(word);
        for (RedditPost redditPost: filteredListRedditPost) {
            sumReact += redditPost.getReact();
        }
        return sumReact;
    }

    // Getter and Setter
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getReact() {
        return react;
    }
}
