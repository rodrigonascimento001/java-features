package br.com.core.rmmapp.features.java8;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Soma de todos os números
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Soma: " + sum);
    }
}