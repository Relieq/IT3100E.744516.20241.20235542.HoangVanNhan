package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // Thuộc tính riêng của Book
    private List<String> authors = new ArrayList<>();

    // Constructor
    public Book() {
        super(); // Gọi constructor của Media
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost); // Gọi constructor của Media
    }

    // Getter và Setter cho authors
    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author " + authorName + " is already in the list.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author " + authorName + " is not in the list.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Authors: " + authors;
    }
}
