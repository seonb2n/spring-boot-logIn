package com.example.demo.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepositoryIfs<T> {

    Optional<T> findById(String id);

    String enroll(T entity);

    void deleteById(String id);

    List<T> showAll();
}
