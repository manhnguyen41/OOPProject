package connector;

import com.google.gson.reflect.TypeToken;
import models.Blog;
import models.Collection;
import services.GsonHandler;

import java.util.List;

public class CollectionConnector{
    // Static method to read Collection from json file
    public static List<Collection> readCollectionFromJson(String path) {
        GsonHandler gsonHandler = new GsonHandler();
        return gsonHandler.fromJson(path, new TypeToken<List<Collection>>(){}.getType());
    }
}
