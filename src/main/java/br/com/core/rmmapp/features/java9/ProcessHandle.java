package br.com.core.rmmapp.features.java9;

import java.io.IOException;

public class ProcessHandle {
    public static void main(String[] args) throws IOException {
        java.lang.ProcessHandle currentProcess = java.lang.ProcessHandle.current();
        System.out.println("Process ID: " + currentProcess.pid());
    }
}