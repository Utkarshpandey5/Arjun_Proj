package library.io;

import library.management.Book;
import java.io.*;

public class FileOperations {

    // Saves the array of books to a file using ObjectOutputStream
    public static void saveBooks(Book[] books, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(books);
            System.out.println("Books saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Loads the array of books from a file using ObjectInputStream
    public static Book[] loadBooks(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Book[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Return an empty array if loading fails
        return new Book[0];
    }
}
