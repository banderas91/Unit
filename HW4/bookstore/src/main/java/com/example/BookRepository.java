package com.example;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    Book findById(int id);
    void save(Book book);
    int getBookCount();
}

