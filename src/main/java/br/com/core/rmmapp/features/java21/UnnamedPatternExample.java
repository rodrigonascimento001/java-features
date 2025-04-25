package br.com.core.rmmapp.features.java21;

public class UnnamedPatternExample {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Object obj = new Point(5, 99);
        if (obj instanceof Point(int x, _)) {
            System.out.println("x = " + x);
        }
    }
}