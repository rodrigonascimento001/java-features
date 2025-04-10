package br.com.core.rmmapp.features.java11;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("example.txt");

        // Escrever em um arquivo
        Files.writeString(filePath, "Hello, Java 11!");

        // Ler de um arquivo
        String content = Files.readString(filePath);
        System.out.println(content); // "Hello, Java 11!"
    }
}