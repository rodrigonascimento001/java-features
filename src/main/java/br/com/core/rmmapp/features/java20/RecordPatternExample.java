package br.com.core.rmmapp.features.java20;

public class RecordPatternExample {
    public static void main(String[] args) {
        Point point = new Point(10, 20);

        if (point instanceof Point(int x, int y)) {
            System.out.println("x: " + x + ", y: " + y); // Output: x: 10, y: 20
        }
    }
}