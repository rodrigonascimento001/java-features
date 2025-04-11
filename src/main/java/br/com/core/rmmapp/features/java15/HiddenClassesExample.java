package br.com.core.rmmapp.features.java15;

import java.lang.invoke.MethodHandles;

public class HiddenClassesExample {
    public static void main(String[] args) throws Exception {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        System.out.println("Hidden Classes podem ser criadas dinamicamente por frameworks.");
    }
}