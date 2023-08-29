package org.example.java_core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        String data = "Hello, Epam!";
        code(data, "MD5");
        code(data, "SHA-1");
        code(data, "SHA-256");
    }

    private static void code(String data, String algorithm) {
        try {
            // Get an instance of the message digest algorithm
            MessageDigest md5Digest = MessageDigest.getInstance(algorithm);

            // Update the digest with the input bytes
            md5Digest.update(data.getBytes());

            // Generate the hash
            byte[] hash = md5Digest.digest();

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println(algorithm + " Hash: " + hexString);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}