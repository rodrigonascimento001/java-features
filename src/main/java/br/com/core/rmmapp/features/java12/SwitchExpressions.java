package br.com.core.rmmapp.features.java12;

public class SwitchExpressions {
    public static void main(String[] args) {
        int day = 3;
        String dayType = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println(dayType); // Output: Weekday
    }
}