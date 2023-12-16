package models;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Collection {
    // Attribute
    private String name;
    private String volume;

    private String change;

    private String floorPrice;

    private String owners;

    private String items;

    // Constructor
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

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(String floorPrice) {
        this.floorPrice = floorPrice;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}
