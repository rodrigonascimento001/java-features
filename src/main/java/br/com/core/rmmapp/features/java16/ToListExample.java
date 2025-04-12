package br.com.core.rmmapp.features.java16;

import java.util.List;
import java.util.stream.Stream;

public class ToListExample {
    public static void main(String[] args) {
        List<String> names = Stream.of("Alice", "Bob", "Charlie").toList();
        System.out.println(names); // [Alice, Bob, Charlie]
    }
}
