package br.com.core.rmmapp.features.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        // Verificar se o valor está presente
        name.ifPresentOrElse(
            value -> System.out.println("Nome: " + value),
            () -> System.out.println("Nome não está presente")
        );
    }
}