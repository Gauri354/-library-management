package com.example.library;

public class App {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        library.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.listBooks();
    }
}

