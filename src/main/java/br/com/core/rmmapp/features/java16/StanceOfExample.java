package br.com.core.rmmapp.features.java16;

public class StanceOfExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java 16!";
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase()); // HELLO, JAVA 16!
        }
    }
}
