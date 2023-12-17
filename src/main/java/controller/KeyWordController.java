package controller;

import models.KeyWord;
import models.RedditPost;
//import org.apache.commons.lang3.EnumUtils;

import java.security.Key;
import java.util.Comparator;
import java.util.List;

class KeyWordComparatorByReactInDayDecreasing implements Comparator<KeyWord> {
    private int timeFrame;

    public KeyWordComparatorByReactInDayDecreasing(String timeFrame) {
        super();
        if (timeFrame.equals("day")) {
            this.timeFrame = 0;
        } else if (timeFrame.equals("month")) {
            this.timeFrame = 1;
        } else {
            this.timeFrame = 2;
        }
    }

    @Override
    public int compare(KeyWord keyWord1, KeyWord keyWord2) {
        return keyWord2.getReact()[0] - keyWord1.getReact()[0];
    }
}

class KeyWordComparatorByReactInDayIncreasing implements Comparator<KeyWord> {
    private int timeFrame;

    public KeyWordComparatorByReactInDayIncreasing(String timeFrame) {
        super();
        if (timeFrame.equals("day")) {
            this.timeFrame = 0;
        } else if (timeFrame.equals("month")) {
            this.timeFrame = 1;
        } else {
            this.timeFrame = 2;
        }
    }

    @Override
    public int compare(KeyWord keyWord1, KeyWord keyWord2) {
        return keyWord1.getReact()[0] - keyWord2.getReact()[0];
    }
}

public class KeyWordController {
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_DAY_DECREASING =
            new KeyWordComparatorByReactInDayDecreasing("day");

    // Static method to sort keyword by react in day decrease
    public static void sortKeyWordByReactInDayDecreasing(List<KeyWord> listKeyWord) {
        listKeyWord.sort(COMPARE_BY_REACT_IN_DAY_DECREASING);
    }

    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_DAY_INCREASING=
            new KeyWordComparatorByReactInDayIncreasing("day");

    // Static method to sort keyword by react in day increase
    public static void sortKeyWordByReactInDayIncreasing(List<KeyWord> listKeyWord) {
        listKeyWord.sort(COMPARE_BY_REACT_IN_DAY_INCREASING);
    }

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
    //get keyword by name
//    public static void A(List<KeyWord> keyWordList, String name){
//        for(KeyWord keyWord: keyWordList){
//            if(keyWord.getWord().equals(name)){
//                System.out.println("Key Word: " + keyWord.getWord() + " " + keyWord.getReact());
//            }
//        }
//    }

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
