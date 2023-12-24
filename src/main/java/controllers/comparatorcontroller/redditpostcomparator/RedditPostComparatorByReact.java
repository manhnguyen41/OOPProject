package controllers.comparatorcontroller.redditpostcomparator;

import controllers.comparatorcontroller.GeneralComparator;
import models.RedditPost;

public class RedditPostComparatorByReact extends GeneralComparator<RedditPost> {
    // Constructor
    public RedditPostComparatorByReact(boolean isASC) {
        super(isASC);
    }

    @Override
    public int compare(RedditPost post1, RedditPost post2) {
        return isASC()
                ? post1.getReact() - post2.getReact()
                : post2.getReact() - post1.getReact();
    }
}
