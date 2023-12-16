package models;

import controller.KeyWordController;

import java.util.ArrayList;
import java.util.List;
import models.RedditPost;

public class KeyWord {
    // Attribute
    private String word;
    private int[] react = new int[3];

    // Constructor
    public KeyWord(String word) {
        this.word = word;
    }

    // Method to calculate react of a keyword
    public void calculateReact(List<RedditPost> listRedditPost) {
        react[0] = KeyWordController.getSumReactByDay(listRedditPost, word);
        react[1] = KeyWordController.getSumReactByMonth(listRedditPost, word);
        react[2] = KeyWordController.getSumReactByYear(listRedditPost, word);
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

    public void setReact(int[] react) {
        this.react = react;
    }
}
