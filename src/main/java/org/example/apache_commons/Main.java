package org.example.apache_commons;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String data = "Hello, Epam!";
        codeMd2(data);
        codeMd5(data);
        codeSha1(data);
        codeSha256(data);
        codeSha512(data);
//        codeSha3_224(data); // not support on java 8
//        codeSha3_256(data);
//        codeSha3_384(data);
//        codeSha3_512(data);
        codeSha512_224(data);
        codeSha512_256(data);
    }

    private static void codeMd2(String data) {
        String hash = DigestUtils.md2Hex(data);
        System.out.println("MD2 Hash: " + hash);
    }

    private static void codeMd5(String data) {
        String hash = DigestUtils.md5Hex(data);
        System.out.println("MD5 Hash: " + hash);
    }

    private static void codeSha1(String data) {
        String hash = DigestUtils.sha1Hex(data);
        System.out.println("SHA1 Hash: " + hash);
    }

    private static void codeSha256(String data) {
        String hash = DigestUtils.sha256Hex(data);
        System.out.println("SHA256 Hash: " + hash);
    }

    private static void codeSha512(String data) {
        String hash = DigestUtils.sha512Hex(data);
        System.out.println("SHA512 Hash: " + hash);
    }

    private static void codeSha3_224(String data) {
        String hash = DigestUtils.sha3_224Hex(data);
        System.out.println("SHA3_224 Hash: " + hash);
    }

    private static void codeSha3_256(String data) {
        String hash = DigestUtils.sha3_256Hex(data);
        System.out.println("SHA3_256 Hash: " + hash);
    }

    private static void codeSha3_384(String data) {
        String hash = DigestUtils.sha3_384Hex(data);
        System.out.println("SHA3_384 Hash: " + hash);
    }

    private static void codeSha3_512(String data) {
        String hash = DigestUtils.sha3_512Hex(data);
        System.out.println("SHA3_512 Hash: " + hash);
    }

    private static void codeSha512_224(String data) {
        String hash = DigestUtils.sha512_224Hex(data);
        System.out.println("SHA512_224 Hash: " + hash);
    }

    private static void codeSha512_256(String data) {
        String hash = DigestUtils.sha512_256Hex(data);
        System.out.println("SHA512_256 Hash: " + hash);
    }
}