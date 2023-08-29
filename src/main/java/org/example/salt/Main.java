package org.example.salt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "mySecretPassword";

        // Generate a random salt
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);

        // Combine password and salt
        byte[] saltedPassword = concatenateByteArrays(password.getBytes(), salt);

        // Hash the salted password using SHA-256
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] hashedPassword = messageDigest.digest(saltedPassword);

        // Convert the hashed password to a Base64-encoded string for storage
        String encodedHashedPassword = Base64.getEncoder().encodeToString(hashedPassword);

        // Print the salt and the encoded hashed password
        System.out.println("Salt: " + Base64.getEncoder().encodeToString(salt));
        System.out.println("Hashed Password: " + encodedHashedPassword);
    }

    // Concatenate two byte arrays
    private static byte[] concatenateByteArrays(byte[] a, byte[] b) {
        byte[] result = new byte[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}