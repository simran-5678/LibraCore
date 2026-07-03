package com.libracore.service;

import com.libracore.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    // List to store all books
    private List<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {

        if (book == null) {
            System.out.println("Cannot add a null book.");
            return;
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("========== LIBRACORE BOOKS ==========");

        for (Book book : books) {
            System.out.println(book);
            System.out.println("-------------------------------------");
        }
    }

    // Search book by title
    public void searchBookByTitle(String title) {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                System.out.println("Book Found:");
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}