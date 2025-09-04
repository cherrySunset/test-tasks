package org.example;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(1, "Lord of the rings", "Tolkien"));
        library.addBook(new Book(2, "Game of Thrones", "Martin"));
        library.addBook(new Book(3, "Sin City", "Miller"));

        System.out.println("\nAll books: " + library.getAllBooks());

        System.out.println("\nId 1: " + library.getBookById(1));

        library.removeBook(3);
        System.out.println("\nUpdate list: " + library.getAllBooks());
    }
}