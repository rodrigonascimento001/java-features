package br.com.core.rmmapp.features.java21;

public class VirtualThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Executando em thread virtual!");
        Thread.startVirtualThread(task);
    }
}