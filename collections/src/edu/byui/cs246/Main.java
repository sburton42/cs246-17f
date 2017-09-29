package edu.byui.cs246;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> books = new ArrayList<>();

        Map<String, Integer> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("booksAndChapters.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(":");
                String book = parts[0];
                int chapters = Integer.parseInt(parts[1]);

                map.put(book, chapters);


                books.add(line);
            }

        }

        for (String key : map.keySet()) {
            int value = map.get(key);

            System.out.println(key);
            System.out.println(value);

        }

        System.out.format("There are %d books in the standard works%n", books.size());

        //displayList(books);
    }

    public static void displayList(List<String> books) {

        for (String book : books) {
            System.out.println(book);
        }
    }
}
