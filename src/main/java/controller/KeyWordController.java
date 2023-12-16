package controller;

import models.KeyWord;
import models.RedditPost;
import org.apache.commons.lang3.EnumUtils;

import java.security.Key;
import java.util.List;

public class KeyWordController {
    // Static method to get sum of react of a list of reddit post by day
    public static int getSumReactByDay(List<RedditPost> listRedditPost,
                                       String keyWord) {
        int sumReact = 0;
        List<RedditPost> filteredListRedditPost
                = RedditPostController.getRedditPostByKeyWord(listRedditPost, keyWord);
        for (RedditPost redditPost: filteredListRedditPost) {
            if (redditPost.getTimeFrame().equals("day")) {
                sumReact += redditPost.getReact();
            }
        }
        return sumReact;
    }

    // Static method to get sum of react of a list of reddit post by month
    public static int getSumReactByMonth(List<RedditPost> listRedditPost,
                                         String keyWord) {
        int sumReact = 0;
        List<RedditPost> filteredListRedditPost
                = RedditPostController.getRedditPostByKeyWord(listRedditPost, keyWord);
        for (RedditPost redditPost: filteredListRedditPost) {
            if (redditPost.getTimeFrame().equals("month")
                    || redditPost.getTimeFrame().equals("day")) {
                sumReact += redditPost.getReact();
            }
        }
        return sumReact;
    }

    // Static method to get sum of react of a list of reddit post by year
    public static int getSumReactByYear(List<RedditPost> listRedditPost,
                                        String keyWord) {
        int sumReact = 0;
        List<RedditPost> filteredListRedditPost
                = RedditPostController.getRedditPostByKeyWord(listRedditPost, keyWord);
        for (RedditPost redditPost: filteredListRedditPost) {
            sumReact += redditPost.getReact();
        }
        return sumReact;
    }

    // Static method to get the hottest keyword by day
    public static KeyWord hotKeyWordbyDay(List<KeyWord> listKeyWord){
        KeyWord hottestKeyWord = listKeyWord.get(0);
        int maxReact = hottestKeyWord.getReact()[0];
        for (KeyWord keyWord: listKeyWord){
            int react = keyWord.getReact()[0];
            if(react > maxReact){
                maxReact = react;
                hottestKeyWord = keyWord;
            }
        }
        return hottestKeyWord;
    }
    // Static method to get the hottest keyword by month
    public static KeyWord hotKeyWordbyMonth(List<KeyWord> listKeyWord){
        KeyWord hottestKeyWord = listKeyWord.get(0);
        int maxReact = hottestKeyWord.getReact()[1];
        for (KeyWord keyWord: listKeyWord){
            int react = keyWord.getReact()[1];
            if(react > maxReact){
                maxReact = react;
                hottestKeyWord = keyWord;
            }
        }
        return hottestKeyWord;
    }

    // Static method to get the hottest keyword by year
    public static KeyWord hotKeyWordbyYear(List<KeyWord> listKeyWord) {
        KeyWord hottestKeyWord = listKeyWord.get(0);
        int maxReact = hottestKeyWord.getReact()[2];
        for (KeyWord keyWord : listKeyWord) {
            int react = keyWord.getReact()[2];
            if (react > maxReact) {
                maxReact = react;
                hottestKeyWord = keyWord;
            }
        }
        return hottestKeyWord;
    }
    // Static method to get a keyword
    public static KeyWord getKeyWord(String word, List<KeyWord> keyWordList) {
        for (KeyWord keyWord: keyWordList) {
            if (keyWord.getWord().equals(word)) {
                return keyWord;
            }
        }
        return null;
    }

//    public static void printHotKeyWord(){
//        List<KeyWord> listKeyWord = new ArrayList<>(crateListKeyWord());
//        String maxCountKeywordByYear = KeyWord.hotKeyWordbyYear(listKeyWord);
//        String maxCountKeywordByDay = KeyWord.hotKeyWordbyDay(listKeyWord);
//        String maxCountKeywordByMonth = KeyWord.hotKeyWordbyMonth(listKeyWord);
//
//        // In ra các keyword có số lượng lớn nhất cho từng loại
//        System.out.println("Max count keyword by year: " + maxCountKeywordByYear);
//        System.out.println("Max count keyword by day: " + maxCountKeywordByDay);
//        System.out.println("Max count keyword by month: " + maxCountKeywordByMonth);
//    }
}
