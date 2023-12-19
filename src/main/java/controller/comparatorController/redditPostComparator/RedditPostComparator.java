package controller.comparatorController.redditPostComparator;

import controller.comparatorController.GeneralComparator;
import models.RedditPost;

import java.util.Comparator;

public class RedditPostComparator extends GeneralComparator<RedditPost> {
    // Constructor
    public RedditPostComparator(boolean isASC) {
        super(isASC);
    }

    @Override
    public int compare(RedditPost post1, RedditPost post2) {
        return isASC()
                ? post1.getReact() - post2.getReact()
                : post2.getReact() - post1.getReact();
    }
}
