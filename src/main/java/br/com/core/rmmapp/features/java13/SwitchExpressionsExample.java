package br.com.core.rmmapp.features.java13;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        int day = 3;

        // Antes do Java 13
        String dayNameOld;
        switch (day) {
            case 1:
                dayNameOld = "Monday";
                break;
            case 2:
                dayNameOld = "Tuesday";
                break;
            case 3:
                dayNameOld = "Wednesday";
                break;
            default:
                dayNameOld = "Invalid day";
        }
        System.out.println("Antes do Java 13: " + dayNameOld);

        // Com Switch Expressions
        String dayNameNew = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid day";
        };
        System.out.println("Com Switch Expressions: " + dayNameNew);
    }
}