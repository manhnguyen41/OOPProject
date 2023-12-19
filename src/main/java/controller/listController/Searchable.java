package controller.listController;

import java.util.List;

public interface Searchable <T>{
    List<T> search(String name);
}
