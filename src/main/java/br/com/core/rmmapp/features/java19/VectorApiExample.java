package br.com.core.rmmapp.features.java19;

import jdk.incubator.vector.*;

public class VectorApiExample {
    public static void main(String[] args) {
        var vector1 = FloatVector.fromArray(FloatVector.SPECIES_256, new float[]{1.0f, 2.0f, 3.0f, 4.0f}, 0);
        var vector2 = FloatVector.fromArray(FloatVector.SPECIES_256, new float[]{5.0f, 6.0f, 7.0f, 8.0f}, 0);
        var result = vector1.add(vector2); // Soma vetorial
        System.out.println(result); // Saída: [6.0, 8.0, 10.0, 12.0]
    }
}