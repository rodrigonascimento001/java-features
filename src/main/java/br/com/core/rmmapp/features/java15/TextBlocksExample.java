package br.com.core.rmmapp.features.java15;

public class TextBlocksExample {
    public static void main(String[] args) {
        // Antes do Text Blocks
        String htmlOld = "<html>\n" +
                         "    <body>\n" +
                         "        <p>Hello, World!</p>\n" +
                         "    </body>\n" +
                         "</html>";
        System.out.println("Antes do Text Blocks:");
        System.out.println(htmlOld);

        // Com Text Blocks
        String htmlNew = """
                <html>
                    <body>
                        <p>Hello, World!</p>
                    </body>
                </html>
                """;
        System.out.println("\nCom Text Blocks:");
        System.out.println(htmlNew);
    }
}