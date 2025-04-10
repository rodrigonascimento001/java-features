package br.com.core.rmmapp.features.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(formatter.format(1_000)); // Output: 1K
        System.out.println(formatter.format(1_000_000)); // Output: 1M
    }
}