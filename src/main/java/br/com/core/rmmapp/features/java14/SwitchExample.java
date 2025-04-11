package br.com.core.rmmapp.features.java14;

public class SwitchExample {
    public static void main(String[] args) {
        String day = "MONDAY";
        int result = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println("Result: " + result);
    }
}