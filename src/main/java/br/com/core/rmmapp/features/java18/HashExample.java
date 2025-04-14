package br.com.core.rmmapp.features.java18;

import java.security.MessageDigest;

public class HashExample {
    public static void main(String[] args) throws Exception {
        String input = "StackSpot";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes());

        System.out.println(bytesToHex(hash)); // Saída: Hash em formato hexadecimal
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}