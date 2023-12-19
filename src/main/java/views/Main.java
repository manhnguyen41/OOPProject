package views;

import models.lists.ListOfKeyWords;
import models.lists.ListOfRedditPosts;
import models.KeyWord;

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

