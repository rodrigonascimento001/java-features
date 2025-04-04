package br.com.core.rmmapp.features.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsImutable {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        Set<String> set = Set.of("X", "Y", "Z");
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}