package br.com.core.rmmapp.features.java10;

import java.util.List;

public class CopyOfExample {
    public static void main(String[] args) {
        List<String> originalList = List.of("A", "B", "C");
        List<String> copiedList = List.copyOf(originalList);

        System.out.println(copiedList);
    }
}