package controller.listController;

import connector.KeyWordConnector;
import controller.comparatorController.keyWordComparator.KeyWordComparatorByReact;
import models.KeyWord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfKeyWords implements Searchable<KeyWord> {
    // Attribute
    private final List<KeyWord> keyWordList;
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_DAY_DECREASING =
            new KeyWordComparatorByReact("day", false);
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_DAY_INCREASING=
            new KeyWordComparatorByReact("day", true);
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_MONTH_DECREASING =
            new KeyWordComparatorByReact("month", false);
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_MONTH_INCREASING=
            new KeyWordComparatorByReact("month", true);
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_YEAR_DECREASING =
            new KeyWordComparatorByReact("year", false);
    public static final Comparator<KeyWord> COMPARE_BY_REACT_IN_YEAR_INCREASING=
            new KeyWordComparatorByReact("year", true);

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
    public List<KeyWord> search(String word) {
        List<KeyWord> filteredList = new ArrayList<>();
        for (KeyWord keyWord: keyWordList) {
            if (keyWord.getWord().toLowerCase().contains(word.toLowerCase())) {
                filteredList.add(keyWord);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<KeyWord> getKeyWordList() {
        return keyWordList;
    }
}
