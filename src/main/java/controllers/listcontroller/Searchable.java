package controllers.listcontroller;

import java.util.List;

public interface Searchable <T>{
    List<T> search(String name);
}
