package br.com.core.rmmapp.features.java8;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rodrigo", "Mayra", "Mariana");
        names.forEach(System.out::println);
    }
}
