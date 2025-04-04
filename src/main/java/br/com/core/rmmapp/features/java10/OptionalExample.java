package br.com.core.rmmapp.features.java10;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 10");

        // Lança NoSuchElementException se o valor não estiver presente
        String value = optional.orElseThrow();
        System.out.println(value);
    }
}