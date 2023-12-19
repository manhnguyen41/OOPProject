package controller.comparatorController.collectionComparator;

import controller.comparatorController.GeneralComparator;
import controller.listController.ListOfCollections;
import models.Collection;

//Sort by change
public class CollectionComparatorByChange extends GeneralComparator<Collection> {
    // Constructor
    public CollectionComparatorByChange(boolean isASC) {
        super(isASC);
    }

    @Override
    public int compare(Collection c1, Collection c2) {
        double change1 = ListOfCollections.ConvertToDouble(c1.getChange());
        double change2 = ListOfCollections.ConvertToDouble(c2.getChange());
        if ((isASC() ? change1 - change2 : change2 - change1) > 0) {
            return 1;
        } else if (change2 - change1 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
