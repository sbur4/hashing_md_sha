package org.example.google_guava;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class Main {
    public static void main(String[] args) {
        String data = "Hello, Epam!";
        codeAdler32(data);
        codeCrc32(data);
        codeCrc32c(data);
        codeFarmHashFingerprint64(data);
        codeFingerprint2011(data);
        codeHmacMd5(data);
        codeHmacSha256(data);
        codeHmacSha512(data);
        codeMd5(data);
        codeMurmur3_32(data);
        codeMurmur3_128(data);
        codeSipHash24(data);
        codeSha1(data);
        codeSha256(data);
        codeSha384(data);
        codeSha512(data);
    }

    private static void codeAdler32(String data) {
        System.out.println("Adler32 Hash: " + generateHashData(data, Hashing.adler32()));
    }

    private static void codeCrc32(String data) {
        System.out.println("Crc32 Hash: " + generateHashData(data, Hashing.crc32()));
    }

    private static void codeCrc32c(String data) {
        System.out.println("Crc32c Hash: " + generateHashData(data, Hashing.crc32c()));
    }

    private static void codeFarmHashFingerprint64(String data) {
        System.out.println("FarmHashFingerprint64 Hash: " + generateHashData(data, Hashing.farmHashFingerprint64()));
    }

    private static void codeFingerprint2011(String data) {
        System.out.println("Fingerprint2011 Hash: " + generateHashData(data, Hashing.fingerprint2011()));
    }

    private static void codeHmacMd5(String data) {
        System.out.println("HmacMd5 Hash: " + generateHashData(data, Hashing.hmacMd5(new byte[]{1, 2, 3})));
    }

    private static void codeHmacSha1(String data) {
        System.out.println("HmacSha1 Hash: " + generateHashData(data, Hashing.hmacSha1(new byte[]{1, 2, 3})));
    }

    private static void codeHmacSha256(String data) {
        System.out.println("HmacSha256 Hash: " + generateHashData(data, Hashing.hmacSha256(new byte[]{1, 2, 3})));
    }

    private static void codeHmacSha512(String data) {
        System.out.println("HmacSha512 Hash: " + generateHashData(data, Hashing.hmacSha512(new byte[]{1, 2, 3})));
    }

    private static void codeMd5(String data) {
        System.out.println("MD5 Hash: " + generateHashData(data, Hashing.md5()));
    }

    private static void codeMurmur3_32(String data) {
        System.out.println("Murmur3_32 Hash: " + generateHashData(data, Hashing.murmur3_32_fixed()));
    }

    private static void codeMurmur3_128(String data) {
        System.out.println("Murmur3_128 Hash: " + generateHashData(data, Hashing.murmur3_128()));
    }

    private static void codeSipHash24(String data) {
        System.out.println("SipHash24 Hash: " + generateHashData(data, Hashing.sipHash24()));
    }

    private static void codeSha1(String data) {
        System.out.println("Sha1 Hash: " + generateHashData(data, Hashing.sha1()));
    }

    private static void codeSha256(String data) {
        System.out.println("Sha256 Hash: " + generateHashData(data, Hashing.sha256()));
    }

    private static void codeSha384(String data) {
        System.out.println("Sha384 Hash: " + generateHashData(data, Hashing.sha384()));
    }

    private static void codeSha512(String data) {
        System.out.println("Sha512 Hash: " + generateHashData(data, Hashing.sha512()));
    }

    private static String generateHashData(String data, HashFunction hashingFunction) {
        return hashingFunction.hashBytes(data.getBytes()).toString();
    }
}