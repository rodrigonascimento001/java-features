package br.com.core.rmmapp.features.java17;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj = 123;
        String result = switch (obj) {
            case Integer i -> "Número inteiro: " + i;
            case String s -> "String: " + s;
            default -> "Outro tipo";
        };
        System.out.println(result); // Número inteiro: 123
    }
}