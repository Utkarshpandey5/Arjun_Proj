package library.management;

import library.io.FileOperations;

public class LibrarySearch {

    public static void main(String[] args) {
        // Check if a book title is provided as a command-line argument
        if (args.length < 1) {
            System.out.println("Please provide a book title as a command-line argument.");
            return;
        }
        String searchTitle = args[0];

        // Load books from the file (assumes "books.dat" exists)
        Book[] books = FileOperations.loadBooks("books.dat");

        // Sort books by title to enable binary search
        LibraryOperations.sortBooksByTitle(books);

        // Search for the book by title
        Book found = LibraryOperations.binarySearchByTitle(books, searchTitle);
        if (found != null) {
            System.out.println("Book Found: " + found);
        } else {
            System.out.println("Book not available");
        }
    }
}
