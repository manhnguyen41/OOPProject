package controller.listController;

import connector.KeyWordConnector;
import models.KeyWord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class KeyWordComparatorByReactDES implements Comparator<KeyWord> {
    private int timeFrame;

    public KeyWordComparatorByReactDES(String timeFrame) {
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
        return keyWord2.getReact()[timeFrame] - keyWord1.getReact()[timeFrame];
    }
}

class KeyWordComparatorByReactASC implements Comparator<KeyWord> {
    private int timeFrame;

    public KeyWordComparatorByReactASC(String timeFrame) {
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
        return keyWord1.getReact()[timeFrame] - keyWord2.getReact()[timeFrame];
    }
}

public class ListOfKeyWords {
    // Attribute
    private List<KeyWord> keyWordList;
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_DAY_DECREASING =
            new KeyWordComparatorByReactDES("day");
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_DAY_INCREASING=
            new KeyWordComparatorByReactASC("day");
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_MONTH_DECREASING =
            new KeyWordComparatorByReactDES("month");
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_MONTH_INCREASING=
            new KeyWordComparatorByReactASC("month");
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_YEAR_DECREASING =
            new KeyWordComparatorByReactDES("year");
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_YEAR_INCREASING=
            new KeyWordComparatorByReactASC("year");

    // Constructor
    public ListOfKeyWords(ListOfRedditPosts redditPostList) {
        keyWordList = KeyWordConnector.getAllKeyWords(redditPostList);
    }

    // Method to sort keyword by react in day decrease
    public void sortKeyWordByReactInDayDecreasing() {
        keyWordList.sort(COMPARE_BY_REACT_IN_DAY_DECREASING);
    }

    // Method to sort keyword by react in day increase
    public void sortKeyWordByReactInDayIncreasing() {
        keyWordList.sort(COMPARE_BY_REACT_IN_DAY_INCREASING);
    }

    // Method to sort keyword by react in day decrease
    public void sortKeyWordByReactInMonthDecreasing() {
        keyWordList.sort(COMPARE_BY_REACT_IN_MONTH_DECREASING);
    }

    // Method to sort keyword by react in day increase
    public void sortKeyWordByReactInMonthIncreasing() {
        keyWordList.sort(COMPARE_BY_REACT_IN_MONTH_INCREASING);
    }

    // Method to sort keyword by react in day decrease
    public void sortKeyWordByReactInYearDecreasing() {
        keyWordList.sort(COMPARE_BY_REACT_IN_YEAR_DECREASING);
    }

    // Method to sort keyword by react in day increase
    public void sortKeyWordByReactInYearIncreasing() {
        keyWordList.sort(COMPARE_BY_REACT_IN_YEAR_INCREASING);
    }

    // Method to search keyword
    public List<KeyWord> getKeyWord(String word) {
        List<KeyWord> filteredList = new ArrayList<>();
        for (KeyWord keyWord: keyWordList) {
            if (keyWord.getWord().contains(word)) {
                filteredList.add(keyWord);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<KeyWord> getKeyWordList() {
        return keyWordList;
    }

    public void setKeyWordList(List<KeyWord> keyWordList) {
        this.keyWordList = keyWordList;
    }
}
