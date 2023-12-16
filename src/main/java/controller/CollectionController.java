package controller;

import models.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionController {
    // Static method to get list of top 100 collections
    public static List<Collection> []getListCollection(List<Collection> listCollection) {
        List<Collection> []filteredListCollection = new ArrayList[6];
        for (int i = 0; i < 6; i++) {
            for (int j = i * 100; j < (i + 1) * 100; j++) {
                filteredListCollection[i].add(listCollection.get(j));
            }
        }
        return filteredListCollection;
    }
}
