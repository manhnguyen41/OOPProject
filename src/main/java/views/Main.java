package views;

import controller.listController.ListOfCollections;
import controller.listController.ListOfKeyWords;
import controller.listController.ListOfRedditPosts;
import models.Collection;
import models.KeyWord;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfRedditPosts redditPosts = new ListOfRedditPosts();
        ListOfKeyWords listOfKeyWords = new ListOfKeyWords(redditPosts);
        for (KeyWord keyWord: listOfKeyWords.getKeyWordList()) {
            System.out.println(keyWord.getReact()[0]);
            System.out.println(keyWord.getReact()[1]);
            System.out.println(keyWord.getReact()[2]);
        }
    }
}

