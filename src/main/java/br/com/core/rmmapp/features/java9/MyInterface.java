package br.com.core.rmmapp.features.java9;

interface MyInterface {
    default void showMessage() {
        log("Hello from default method!");
    }

    private void log(String message) {
        System.out.println(message);
    }
}