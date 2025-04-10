package br.com.core.rmmapp.features.java11;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        // isEmpty
        System.out.println(optional.isEmpty()); // true
    }
}