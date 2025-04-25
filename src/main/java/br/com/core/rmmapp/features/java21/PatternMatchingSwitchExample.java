package br.com.core.rmmapp.features.java21;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object o = 42;
        System.out.println(formatter(o));
        o = "StackSpot";
        System.out.println(formatter(o));
        o = 3.14;
        System.out.println(formatter(o));
    }

    static String formatter(Object o) {
        return switch (o) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown";
        };
    }
}