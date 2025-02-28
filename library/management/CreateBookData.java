package library.management;

import library.io.FileOperations;

public class CreateBookData {

    public static void main(String[] args) {
        // Create an array of sample Book objects
        Book[] books = new Book[5];
        books[0] = new Book("Effective Java", "Joshua Bloch", "9780134685991", true);
        books[1] = new Book("Clean Code", "Robert C. Martin", "9780132350884", true);
        books[2] = new Book("Design Patterns", "Erich Gamma", "9780201633610", true);
        books[3] = new Book("Java Concurrency in Practice", "Brian Goetz", "9780321349606", true);
        books[4] = new Book("Head First Java", "Kathy Sierra", "9780596009205", true);

        // Save the book data to "books.dat"
        FileOperations.saveBooks(books, "books.dat");
    }
}
