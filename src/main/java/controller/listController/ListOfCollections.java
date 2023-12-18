package controller.listController;

import connector.CollectionConnector;
import models.Collection;
import var.GlobalVar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Sort by change ascending
class CollectionComparatorByChangeASC implements Comparator<Collection> {
    @Override
    public int compare(Collection c1, Collection c2){
        double change1 = ListOfCollections.ConvertToDouble(c1.getChange());
        double change2 = ListOfCollections.ConvertToDouble(c2.getChange());
        if(change1 - change2 > 0){
            return 1;
        } else if (change2 - change1 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}

//Sort by change descending
class CollectionComparatorByChangeDES implements Comparator<Collection> {
    @Override
    public int compare(Collection c1, Collection c2){
        double change1 = ListOfCollections.ConvertToDouble(c1.getChange());
        double change2 = ListOfCollections.ConvertToDouble(c2.getChange());
        if(change2 - change1 > 0){
            return 1;
        } else if (change2 - change1 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}

//Sort by volume ascending
class CollectionComparatorByVolumeASC implements Comparator<Collection> {
    @Override
    public int compare(Collection c1, Collection c2) {
        double volume1 = ListOfCollections.ConvertToDouble(c1.getVolume());
        double volume2 = ListOfCollections.ConvertToDouble(c2.getVolume());
        if (volume1 - volume2 > 0) {
            return 1;
        } else if (volume2 - volume1 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}

//Sort by volume descending
class CollectionComparatorByVolumeDES implements Comparator<Collection> {
    @Override
    public int compare(Collection c1, Collection c2) {
        double volume1 = ListOfCollections.ConvertToDouble(c1.getVolume());
        double volume2 = ListOfCollections.ConvertToDouble(c2.getVolume());
        if (volume2 - volume1 > 0) {
            return 1;
        } else if (volume2 - volume1 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}

//Sort by floorPrice ascending
class CollectionComparatorByFloorPriceASC implements Comparator<Collection>{
    @Override
    public int compare(Collection c1, Collection c2){
        double floorPrice1 = ListOfCollections.ConvertToDouble(c1.getFloorPrice());
        double floorPrice2 = ListOfCollections.ConvertToDouble(c2.getFloorPrice());
        if(floorPrice1 - floorPrice2 > 0){
            return 1;
        } else if (floorPrice1 - floorPrice2 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}

//Sort by floorPrice descending
class CollectionComparatorByFloorPriceDES implements Comparator<Collection>{
    @Override
    public int compare(Collection c1, Collection c2){
        double floorPrice1 = ListOfCollections.ConvertToDouble(c1.getFloorPrice());
        double floorPrice2 = ListOfCollections.ConvertToDouble(c2.getFloorPrice());
        if(floorPrice2 - floorPrice1 > 0){
            return 1;
        } else if (floorPrice1 - floorPrice2 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}

public class ListOfCollections {
    // Attribute
    private List<Collection> collectionList;
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_ASC = 
            new CollectionComparatorByVolumeASC();
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_DES = 
            new CollectionComparatorByVolumeDES();
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_ASC = 
            new CollectionComparatorByFloorPriceASC();
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_DES = 
            new CollectionComparatorByFloorPriceDES();
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_CHANGE_ASC =
            new CollectionComparatorByChangeASC();
    public static final Comparator<Collection> COMPARE_COLLECTION_BY_CHANGE_DES =
            new CollectionComparatorByChangeDES();
    
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
        for (int i = 0; i < 6; i++) {
            filteredcollectionList[i] = new ArrayList<>();

            for (int j = i * 100; j < (i + 1) * 100; j++) {
                filteredcollectionList[i].add(collectionList.get(j));
                if (j == collectionList.size() - 1){
                    break;
                }
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
        return result;
    }

    // Method to search collection by Name
    public List<Collection> getCollectionByName(String name){
        List<Collection> filteredList = new ArrayList<>();
        for(Collection collection: collectionList){
            if(collection.getName().contains(name)){
                filteredList.add(collection);
            }
        }
        return filteredList;
    }
    
    // Constructor
    public ListOfCollections() {
        collectionList = CollectionConnector
                .readCollectionFromJson(GlobalVar.path + "/Collection.json");
    }
    
    // Getter and Setter
    public List<Collection> getCollectionList() {
        return collectionList;
    }

    public void setCollectionList(List<Collection> collectionList) {
        this.collectionList = collectionList;
    }
}
