package controllers.comparatorcontroller.keywordcomparator;

import controllers.comparatorcontroller.GeneralComparator;
import models.KeyWord;

public class KeyWordComparatorByReact extends GeneralComparator<KeyWord> {
    // Attribute
    private final int timeFrame;

    // Constructor
    public KeyWordComparatorByReact(String timeFrame, boolean isASC) {
        super(isASC);
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
        return isASC()
                ? keyWord1.getReact()[timeFrame] - keyWord2.getReact()[timeFrame]
                : keyWord2.getReact()[timeFrame] - keyWord1.getReact()[timeFrame];
    }
}
