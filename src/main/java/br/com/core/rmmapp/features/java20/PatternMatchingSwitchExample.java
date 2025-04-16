package br.com.core.rmmapp.features.java20;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj = 123;

        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };

        System.out.println(result); // Output: Integer: 123
    }
}