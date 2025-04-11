package br.com.core.rmmapp.features.java14;

public class NPEExample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // Lança NullPointerException com detalhes
    }
}