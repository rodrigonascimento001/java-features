package br.com.core.rmmapp.features.java8;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Implementação usando lambda
        Calculator addition = (a, b) -> a + b;
        System.out.println("Soma: " + addition.calculate(5, 3));
    }
}