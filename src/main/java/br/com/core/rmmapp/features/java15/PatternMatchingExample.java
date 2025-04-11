package br.com.core.rmmapp.features.java15;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        // Antes do Pattern Matching
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("String length: " + str.length());
        }

        // Com Pattern Matching
        if (obj instanceof String str) {
            System.out.println("String length: " + str.length());
        }
    }
}