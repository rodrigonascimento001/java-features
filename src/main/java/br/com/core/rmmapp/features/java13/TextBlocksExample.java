package br.com.core.rmmapp.features.java13;

public class TextBlocksExample {
    public static void main(String[] args) {
        // Antes do Java 13
        String jsonOld = "{\n" +
                         "  \"name\": \"John\",\n" +
                         "  \"age\": 30\n" +
                         "}";
        System.out.println("Antes do Java 13:");
        System.out.println(jsonOld);

        // Com Text Blocks
        String jsonNew = """
                         {
                           "name": "John",
                           "age": 30
                         }
                         """;
        System.out.println("\nCom Text Blocks:");
        System.out.println(jsonNew);
    }
}