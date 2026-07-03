package com.libracore.service;

import com.libracore.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

}