package controller.listController;

import connector.CollectionConnector;
import controller.comparatorController.collectionComparator.CollectionComparatorByChange;
import controller.comparatorController.collectionComparator.CollectionComparatorByFloorPrice;
import controller.comparatorController.collectionComparator.CollectionComparatorByVolume;
import models.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfCollections {
    // Attribute
    private List<Collection> collectionList;
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_ASC = 
            new CollectionComparatorByVolume(true);
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_DES = 
            new CollectionComparatorByVolume(false);
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_ASC = 
            new CollectionComparatorByFloorPrice(true);
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_DES = 
            new CollectionComparatorByFloorPrice(false);
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_CHANGE_ASC =
            new CollectionComparatorByChange(true);
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_CHANGE_DES =
            new CollectionComparatorByChange(false);

    // Constructor
    public ListOfCollections() {
        collectionList = CollectionConnector
                .readCollectionFromJson("data/Collection.json");
    }
    
    //Sort by volume ascending
    public void sortCollectionByVolumeASC(){
        collectionList.sort(COMPARE_COLLECTION_BY_VOLUME_ASC);
    }

    //Sort by volume descending
    public void sortCollectionByVolumeDES(){
        collectionList.sort(COMPARE_COLLECTION_BY_VOLUME_DES);
    }

    //Sort by floorPrice ascending
    public void sortCollectionByFloorPriceASC(){
        collectionList.sort(COMPARE_COLLECTION_BY_FLOOR_PRICE_ASC);
    }

    //Sort by floorPrice descending
    public void sortCollectionByFloorPriceDES(){
        collectionList.sort(COMPARE_COLLECTION_BY_FLOOR_PRICE_DES);
    }

    //Sort by change ascending
    public void sortCollectionByChangeASC(){
        collectionList.sort(COMPARE_COLLECTION_BY_CHANGE_ASC);
    }

    //Sort by change descending
    public void sortCollectionByChangeDES(){
        collectionList.sort(COMPARE_COLLECTION_BY_CHANGE_DES);
    }

    // Method to get list of top 100 collections
    public List<Collection> []getTop100Collection() {
        List<Collection> []filteredcollectionList = new ArrayList[6];
        filteredcollectionList[0] = new ArrayList<>();
        for (int i = 0; i < collectionList.size() - 500; i++) {
            filteredcollectionList[0].add(collectionList.get(i));
        }
        for (int i = 1; i < 6; i++) {
            filteredcollectionList[i] = new ArrayList<>();
            for (int j = collectionList.size() - 500 + (i - 1) * 100;
                 j < collectionList.size() - 500 + i * 100; j++) {
                filteredcollectionList[i].add(collectionList.get(j));
            }
        }
        return filteredcollectionList;
    }

    //Static method to convert String to Double
    public static double ConvertToDouble(String input) {
        input = input.replace(",", "");
        if (input.charAt(0) == '-' && input.length() != 2) {
            return 0 - Double.parseDouble(input.substring(1));
        }
        if (input.charAt(0) == '+' && input.length() != 2) {
            return Double.parseDouble(input.substring(1));
        }
        if(!Character.isDigit(input.charAt(0))){
            double result = 0;
            return result;
        }

        int index = 0;
        while (index < input.length()
                && (Character.isDigit(input.charAt(index)) || (input.charAt(index) == '.' ))) {
            index++;
        }

        // Sử dụng substring để lấy phần số từ chuỗi
        String numericString = input.substring(0, index);

        // Chuyển chuỗi thành kiểu double
        double result = Double.parseDouble(numericString);
        if (input.charAt(index) == 'K'){
            result = result * 1000;
        }

        if (input.charAt(index) == 'M'){
            result = result * 1000000;
        }
        return result;
    }

    // Method to search collection by Name
    public List<Collection> getCollectionByName(String name){
        List<Collection> filteredList = new ArrayList<>();
        for(Collection collection: collectionList){
            if(collection.getName().toLowerCase().contains(name.toLowerCase())){
                filteredList.add(collection);
            }
        }
        return filteredList;
    }
    
    // Getter and Setter
    public List<Collection> getCollectionList() {
        return collectionList;
    }

    public void setCollectionList(List<Collection> collectionList) {
        this.collectionList = collectionList;
    }
}
