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
    private String description;
    private String contributorId;

    public Book() {
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "description='" + description + '\'' +
                ", bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                ", edition=" + edition +
                ", language='" + language + '\'' +
                ", category=" + category +
                ", totalCopies=" + totalCopies +
                ", availableCopies=" + availableCopies +
                ", status=" + status +
                ", contributorId='" + contributorId + '\'' +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContributorId(String contributorId) {
        this.contributorId = contributorId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getEdition() {
        return edition;
    }

    public String getLanguage() {
        return language;
    }

    public Category getCategory() {
        return category;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public BookStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getContributorId() {
        return contributorId;
    }

    public Book(String bookId, String title, String author, String isbn, String publisher, int publicationYear, int edition, String language, Category category, int totalCopies, int availableCopies, BookStatus status, String description, String contributorId) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.edition = edition;
        this.language = language;
        this.category = category;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
        this.status = status;
        this.description = description;
        this.contributorId = contributorId;

    }
}
