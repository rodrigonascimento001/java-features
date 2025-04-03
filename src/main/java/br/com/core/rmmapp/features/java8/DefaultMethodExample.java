package br.com.core.rmmapp.features.java8;

interface Vehicle {
    default void start() {
        System.out.println("O veículo está iniciando...");
    }
}

class Car implements Vehicle {
    // Pode usar o método default ou sobrescrevê-lo
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); // Saída: O veículo está iniciando...
    }
}