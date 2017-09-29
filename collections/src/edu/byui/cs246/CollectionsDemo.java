package edu.byui.cs246;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        CollectionsDemo demo = new CollectionsDemo();

        List<String> books = demo.loadBooks();
        demo.displayBooks(books);
    }

    public List<String> loadBooks() {
        List<String> books = new ArrayList<>();

        books.add("1 Nephi");
        books.add("2 Nephi");
        books.add("Jacob");
        books.add("Enos");
        books.add("Jarom");
        books.add("Omni");
        books.add("Words of Mormon");
        books.add("Mosiah");

        return books;
    }

    public void displayBooks(List<String> books) {

        Collections.sort(books, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (String book : books) {
            System.out.println(book);
        }
    }
}
