package br.com.core.rmmapp.features.java9;

import java.util.stream.Stream;

public class StreamTakeAwhile {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        // takeWhile: Pega elementos enquanto a condição for verdadeira
        stream.takeWhile(n -> n < 4).forEach(System.out::println); // Saída: 1, 2, 3
    }
}