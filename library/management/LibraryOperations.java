package library.management;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryOperations {

    // Sorts books alphabetically by title (ignoring case)
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                // Handle potential null entries in the array
                if (b1 == null && b2 == null) return 0;
                if (b1 == null) return 1;
                if (b2 == null) return -1;
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });
    }

    // Performs binary search for a book by title on a sorted array
    public static Book binarySearchByTitle(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (books[mid] == null) break;
            int comp = books[mid].getTitle().compareToIgnoreCase(title);
            if (comp == 0) {
                return books[mid];
            } else if (comp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }

    // Creates a copy of the books array for backup
    public static Book[] copyBooks(Book[] books) {
        return Arrays.copyOf(books, books.length);
    }
}
