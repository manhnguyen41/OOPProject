package views;

import connector.CollectionConnector;
import connector.KeyWordConnector;
import connector.RedditPostConnector;
import controller.CollectionController;
import controller.KeyWordController;
import controller.RedditPostController;
import models.Collection;
import models.KeyWord;
import models.RedditPost;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Collection> collectionList = CollectionConnector.readCollectionFromJson("G:\\OOP_Lab\\Project_NFT\\OOPProject\\data\\Collection.json");
        CollectionController.sortCollectionByFloorPriceASC(collectionList);
        for(Collection collection: collectionList){
            System.out.println(collection.getFloorPrice());
        }

    }
}
