package br.com.core.rmmapp.features.java14;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase()); // HELLO, WORLD!
        }
    }
}