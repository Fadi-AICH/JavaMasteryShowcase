package org.example;

import java.util.ArrayList;

public interface IDAO<T> {
    int insert(T obj);
    int update(T obj);
    int delete(int id);
    ArrayList<T> Select();
}
