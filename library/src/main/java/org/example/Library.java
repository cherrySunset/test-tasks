package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book){
        books.put(book.getId(), book);
    }

    public List<Book> getAllBooks () {
        return new ArrayList<>(books.values());
    }

    public Book getBookById (int id){
        return books.get(id);
    }

    public void removeBook (int id){
        books.remove(id);
    }
}
