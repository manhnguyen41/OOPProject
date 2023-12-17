package controller;

import models.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort by volume ascending
class CollectionComparatorByVolumeASC implements Comparator<Collection>{
    public CollectionComparatorByVolumeASC() {
        super();
    }


    @Override
    public int compare(Collection c1, Collection c2){
        double volume1 = CollectionController.ConvertToDouble(c1.getVolume());
        double volume2 = CollectionController.ConvertToDouble(c2.getVolume());
        if(volume1 - volume2 > 0){
            return 1;
        } else if (volume2 - volume1 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}
//Sort by volume descending
class CollectionComparatorByVolumeDES implements Comparator<Collection>{
    public CollectionComparatorByVolumeDES() {
        super();
    }


    @Override
    public int compare(Collection c1, Collection c2){
        double volume1 = CollectionController.ConvertToDouble(c1.getVolume());
        double volume2 = CollectionController.ConvertToDouble(c2.getVolume());
        if(volume2 - volume1 > 0){
            return 1;
        } else if (volume2 - volume1 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}
//Sort by floorPrice ascending
class CollectionComparatorByFloorPriceASC implements Comparator<Collection>{

    @Override
    public int compare(Collection c1, Collection c2){
        double floorPrice1 = CollectionController.ConvertToDouble(c1.getFloorPrice());
        double floorPrice2 = CollectionController.ConvertToDouble(c2.getFloorPrice());
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
        double floorPrice1 = CollectionController.ConvertToDouble(c1.getFloorPrice());
        double floorPrice2 = CollectionController.ConvertToDouble(c2.getFloorPrice());
        if(floorPrice2 - floorPrice1 > 0){
            return 1;
        } else if (floorPrice1 - floorPrice2 == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}
public class CollectionController {

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_ASC = new CollectionComparatorByVolumeASC();
    //Sort by volume ascending
    public static void sortCollectionByVolumeASC(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_VOLUME_ASC);
    }

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_DES = new CollectionComparatorByVolumeDES();
    //Sort by volume descending
    public static void sortCollectionByVolumeDES(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_VOLUME_DES);
    }

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_ASC = new CollectionComparatorByFloorPriceASC();
    //Sort by floorPrice ascending
    public static void sortCollectionByFloorPriceASC(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_FLOOR_PRICE_ASC);
    }

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_DES = new CollectionComparatorByFloorPriceDES();
    //Sort by floorPrice descending
    public static void sortCollectionByFloorPriceDES(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_FLOOR_PRICE_DES);
    }
    //Convert String to Float
    public static double ConvertToDouble(String input) {
        if(!Character.isDigit(input.charAt(0))){
            double result = 0;
            return result;
        } else {
            int index = 0;
            while (index < input.length() && (Character.isDigit(input.charAt(index)) || (input.charAt(index) == '.' ))) {
                index++;
            }

            // Sử dụng substring để lấy phần số từ chuỗi
            String numericString = input.substring(0, index);

            // Chuyển chuỗi thành kiểu double
            double result = Double.parseDouble(numericString);
            if (input.charAt(index) == 'K'){
                result = result * 10000;
            }
            return result;
        }
    }
    // Static method to get list of top 100 collections
    public static List<Collection> []getListCollection(List<Collection> listCollection) {
        List<Collection> []filteredListCollection = new ArrayList[6];
        for (int i = 0; i < 6; i++) {

            filteredListCollection[i] = new ArrayList<>();

            for (int j = i * 100; j < (i + 1) * 100; j++) {
                filteredListCollection[i].add(listCollection.get(j));
                if (j == listCollection.size() - 1){
                    break;
                }
            }
        }
        return filteredListCollection;
    }

    public static Collection getCollectionByName(List<Collection> collectionList, String name){
        for(Collection collection: collectionList){
            if(collection.getName().equals(name)){
                return collection;
            }
        }
        return null;
    }

    //Get collection by name
//    public static void getCollectionByName(List<Collection> collectionList, String name){
//        for(Collection collection: collectionList){
//            if(collection.getName().equals(name)){
//                System.out.println("NFT: " + collection.getName() + " " + collection.getVolume() +
//                        " " + collection.getChange() + " " + collection.getVolume() + " " + collection.getFloorPrice() + " " + collection.getOwners() + " "
//                        + collection.getOwners());
//            }
//        }
//    }

}
