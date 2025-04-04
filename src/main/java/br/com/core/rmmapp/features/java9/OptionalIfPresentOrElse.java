package br.com.core.rmmapp.features.java9;

import java.util.Optional;

public class OptionalIfPresentOrElse {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        optional.ifPresentOrElse(
            value -> System.out.println("Value: " + value),
            () -> System.out.println("No value present")
        );
    }
}