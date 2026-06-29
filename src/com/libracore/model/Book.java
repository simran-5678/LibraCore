package com.libracore.model;

import com.libracore.enums.BookStatus;
import com.libracore.enums.Category;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int publicationYear;
    private int edition;
    private String language;
    private Category category;
    private int totalCopies;
    private int availableCopies;
    private BookStatus status;

}