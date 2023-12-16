package controller;

import models.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CollectionComparatorByVolumeASC implements Comparator<Collection>{
    public CollectionComparatorByVolumeASC() {
        super();
    }

    private static double ConvertToDouble(String input) {
        // Tìm vị trí đầu tiên của ký tự không phải số
        int index = input.indexOf(" ");

        // Sử dụng substring để lấy phần số từ chuỗi
        String numericString = input.substring(0, index);

        // Chuyển chuỗi thành kiểu double
        double result = Double.parseDouble(numericString);

        return result;
    }
    public int compare(Collection c1, Collection c2){
        double volume1 = ConvertToDouble(c1.getVolume());
        double volume2 = ConvertToDouble(c2.getVolume());
        return (int)(volume1 - volume2);
    }
}

class CollectionComparatorByVolumeDES implements Comparator<Collection>{
    public CollectionComparatorByVolumeDES() {
        super();
    }

    private static double ConvertToDouble(String input) {
        // Tìm vị trí đầu tiên của ký tự không phải số
        int index = input.indexOf(" ");
        // Sử dụng substring để lấy phần số từ chuỗi
        String numericString = input.substring(0, index);

        // Chuyển chuỗi thành kiểu double
        double result = Double.parseDouble(numericString);

        return result;
    }
    public int compare(Collection c1, Collection c2){
        double volume1 = ConvertToDouble(c1.getVolume());
        double volume2 = ConvertToDouble(c2.getVolume());
        return (int)(volume2 - volume1);
    }
}

class CollectionComparatorByFloorPriceASC implements Comparator<Collection>{

    private static double ConvertToDouble(String input) {
        // Tìm vị trí đầu tiên của ký tự không phải số
        int index = input.indexOf(" ");

        // Sử dụng substring để lấy phần số từ chuỗi
        String numericString = input.substring(0, index);

        // Chuyển chuỗi thành kiểu double
        double result = Double.parseDouble(numericString);

        return result;
    }
    public int compare(Collection c1, Collection c2){
        double volume1 = ConvertToDouble(c1.getFloorPrice());
        double volume2 = ConvertToDouble(c2.getFloorPrice());
        return (int)(volume1 - volume2);
    }
}

class CollectionComparatorByFloorPriceDES implements Comparator<Collection>{

    private static double ConvertToDouble(String input) {
        // Tìm vị trí đầu tiên của ký tự không phải số
        int index = input.indexOf(" ");

        // Sử dụng substring để lấy phần số từ chuỗi
        String numericString = input.substring(0, index);

        // Chuyển chuỗi thành kiểu double
        double result = Double.parseDouble(numericString);

        return result;
    }
    public int compare(Collection c1, Collection c2){
        double volume1 = ConvertToDouble(c1.getFloorPrice());
        double volume2 = ConvertToDouble(c2.getFloorPrice());
        return (int)(volume2 - volume1);
    }
}
public class CollectionController {

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_ASC = new CollectionComparatorByVolumeASC();
    public static void sortCollectionByVolumeASC(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_VOLUME_ASC);
    }

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_VOLUME_DES = new CollectionComparatorByVolumeDES();
    public static void sortCollectionByVolumeDES(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_VOLUME_ASC);
    }

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_ASC = new CollectionComparatorByFloorPriceASC();
    public static void sortCollectionByFloorPriceASC(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_VOLUME_ASC);
    }

    public static final Comparator<Collection> COMPARE_COLLECTION_BY_FLOOR_PRICE_DES = new CollectionComparatorByFloorPriceDES();
    public static void sortCollectionByFloorPriceDES(List<Collection> listCollection){
        listCollection.sort(COMPARE_COLLECTION_BY_VOLUME_ASC);
    }
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
