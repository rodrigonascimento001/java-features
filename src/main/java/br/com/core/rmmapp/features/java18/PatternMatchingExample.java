package br.com.core.rmmapp.features.java18;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = 123;

        String result = switch (obj) {
            case Integer i -> "Número inteiro: " + i;
            case String s -> "Texto: " + s;
            default -> "Outro tipo";
        };

        System.out.println(result); // Saída: Número inteiro: 123
    }
}