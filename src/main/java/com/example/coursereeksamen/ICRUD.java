package com.example.coursereeksamen;

import java.util.Optional;
import java.util.Set;

public interface ICRUD <T, ID> {

    Set<T> findAll();
    T save(T object);
    void delete(Optional<T> object);
    void deleteById(ID id);
    Optional<T> findById(ID id);

}
