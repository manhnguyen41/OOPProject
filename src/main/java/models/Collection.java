package models;

public class Collection {
    private String name;
    private String volume;

    private String change;

    private String floorPrice;

    private String owners;

    private String items;

    public Collection() {
    }

    public Collection(String name, String volume, String change, String floorPrice, String owners, String items) {
        this.name = name;
        this.volume = volume;
        this.change = change;
        this.floorPrice = floorPrice;
        this.owners = owners;
        this.items = items;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return "Collection{" +
//                "name='" + name + '\'' +
//                ", volume='" + volume + '\'' +
//                ", change='" + change + '\'' +
//                ", floorPrice='" + floorPrice + '\'' +
//                ", owners='" + owners + '\'' +
//                ", items='" + items + '\'' +
//                '}';
//    }
}
