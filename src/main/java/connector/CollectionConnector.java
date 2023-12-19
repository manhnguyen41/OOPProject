package connector;

import com.google.gson.reflect.TypeToken;
import models.Collection;
import services.GsonHandler;

import java.util.List;

public class CollectionConnector{
    // Static method to read Collection from json file
    public static List<Collection> readCollectionFromJson(String path) {
        GsonHandler gsonHandler = new GsonHandler();
        List<Collection> collectionList = gsonHandler.fromJson(path, new TypeToken<List<Collection>>(){}.getType());
        for (Collection collection: collectionList) {
            collection.setChange(collection.getChange() + "%");
        }
        return collectionList;
    }
}
