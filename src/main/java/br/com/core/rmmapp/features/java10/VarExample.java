package br.com.core.rmmapp.features.java10;

import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        var message = "Olá, Java 10!"; // O tipo é inferido como String
        var numbers = List.of(1, 2, 3, 4, 5); // O tipo é inferido como List<Integer>

        System.out.println(message);
        numbers.forEach(System.out::println);
    }
}