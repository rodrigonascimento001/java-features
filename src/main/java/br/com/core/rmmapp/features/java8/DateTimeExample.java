package br.com.core.rmmapp.features.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Data atual
        LocalTime time = LocalTime.now(); // Hora atual
        LocalDateTime dateTime = LocalDateTime.now(); // Data e hora atuais

        System.out.println("Data: " + date);
        System.out.println("Hora: " + time);
        System.out.println("Data e Hora: " + dateTime);
    }
}