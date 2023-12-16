package connector;

import com.google.gson.reflect.TypeToken;
import models.Blog;
import models.Collection;
import java.util.List;

public class CollectionConnector extends Connector{
    // Static method to read Collection from json file
    public static List<Collection> readCollectionFromJson(String path) {
        return readFromJson(path, new TypeToken<List<Collection>>(){}.getType());
    }
}
