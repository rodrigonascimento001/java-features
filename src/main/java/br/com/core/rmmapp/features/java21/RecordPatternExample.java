package br.com.core.rmmapp.features.java21;

public class RecordPatternExample {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Object obj = new Point(10, 20);
        if (obj instanceof Point(int x, int y)) {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}