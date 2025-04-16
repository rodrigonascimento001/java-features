package br.com.core.rmmapp.features.java20;

import java.util.concurrent.Executors;

public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Running in virtual thread: " + Thread.currentThread());
                });
            }
        }
    }
}