package br.com.core.rmmapp.features.java21;

import java.util.SequencedCollection;
import java.util.ArrayList;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> sc = new ArrayList<>();
        sc.addFirst("A");
        sc.addLast("B");
        System.out.println(sc); // [A, B]
    }
}