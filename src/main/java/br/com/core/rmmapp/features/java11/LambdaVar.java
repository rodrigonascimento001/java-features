package br.com.core.rmmapp.features.java11;

import java.util.function.BiFunction;

public class LambdaVar {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (var a, var b) -> a + b;
        System.out.println(sum.apply(5, 10)); // 15
    }
}