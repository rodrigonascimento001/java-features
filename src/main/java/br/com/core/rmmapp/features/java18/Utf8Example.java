package br.com.core.rmmapp.features.java18;

import java.nio.file.Files;
import java.nio.file.Path;

public class Utf8Example {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("example.txt");
        Files.writeString(filePath, "Olá, mundo!"); // Salva o texto em UTF-8
        String content = Files.readString(filePath); // Lê o texto em UTF-8
        System.out.println(content); // Saída: Olá, mundo!
    }
}