package br.com.core.rmmapp.features.java11;

public class StringFeatures {
    public static void main(String[] args) {
        String str = "  Hello Java 11  ";
        
        // isBlank
        System.out.println("".isBlank()); // true
        System.out.println("   ".isBlank()); // true

        // lines
        String multiline = "Line1\nLine2\nLine3";
        multiline.lines().forEach(System.out::println);

        // strip
        System.out.println(str.strip()); // "Hello Java 11"

        // repeat
        System.out.println("Java".repeat(3)); // "JavaJavaJava"
    }
}