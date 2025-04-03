package br.com.core.rmmapp.features.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bruno", "Carlos");

        // Usando referência a método
        names.forEach(System.out::println);
    }
}