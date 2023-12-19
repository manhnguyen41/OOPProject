package controller.comparatorController.collectionComparator;

import controller.comparatorController.GeneralComparator;
import models.Collection;

//Sort by floorPrice
public class CollectionComparatorByFloorPrice extends GeneralComparator<Collection> {
    // Constructor
    public CollectionComparatorByFloorPrice(boolean isASC) {
        super(isASC);
    }

    @Override
    public int compare(Collection c1, Collection c2) {
        double floorPrice1 = convertToDouble(c1.getFloorPrice());
        double floorPrice2 = convertToDouble(c2.getFloorPrice());
        if ((isASC() ? floorPrice1 - floorPrice2 : floorPrice2 - floorPrice1)  > 0) {
            return 1;
        } else if (floorPrice1 - floorPrice2 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
