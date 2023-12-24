package controllers.comparatorController.collectionComparator;

import controllers.comparatorController.GeneralComparator;
import models.Collection;

//Sort by volume
public class CollectionComparatorByVolume extends GeneralComparator<Collection> {
    // Constructor
    public CollectionComparatorByVolume(boolean isASC) {
        super(isASC);
    }

    @Override
    public int compare(Collection c1, Collection c2) {
        double volume1 = convertToDouble(c1.getVolume());
        double volume2 = convertToDouble(c2.getVolume());
        if ((isASC() ? volume1 - volume2 : volume2 - volume1) > 0) {
            return 1;
        } else if (volume2 - volume1 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
