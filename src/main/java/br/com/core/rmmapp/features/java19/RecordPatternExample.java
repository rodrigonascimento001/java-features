package br.com.core.rmmapp.features.java19;

public class RecordPatternExample {
    public static void main(String[] args) {
        Object obj = new Point(3, 4);

        if (obj instanceof Point(int x, int y)) {
            System.out.println("Ponto: x=" + x + ", y=" + y); // Saída: Ponto: x=3, y=4
        }
    }
}