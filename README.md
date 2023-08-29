# CONFIG

* Java 8
* Gradle 8
* Intellij Idea Community

## INFO

* Folder 'libs' for the jars to use offline

## DOX

* **Cryptographic Hash Functions**:

```
 - MD2: A widely used cryptographic hash function that produces a 128-bit hash value. It's considered highly insecure 
 due to vulnerabilities and is not recommended for security-sensitive applications.
 - SHA-1 (Secure Hash Algorithm 1): A cryptographic hash function that produces a 160-bit hash value. It was once widely
  used but is now considered weak and insecure due to vulnerabilities.
 - SHA-256, SHA-384, SHA-512, SHA-512/224, SHA-512/256: Variants of the Secure Hash Algorithm (SHA) that produce hash 
 values of different lengths (256, 384, 512 bits) and are widely used for security-sensitive applications. SHA-256 is 
 commonly used for secure data hashing.
```

* **Non-Cryptographic Hash Functions**:

```
- Adler32: A non-cryptographic hash function that's often used for checksums and error checking in non-cryptographic applications.
- CRC32 (Cyclic Redundancy Check 32): Another non-cryptographic hash function used for error checking and verification, 
especially in network communications.
- CRC32C: A CRC variant that's optimized for modern processors and is used for data integrity checks.
- FarmHashFingerprint6, Fingerprint2011: Non-cryptographic hash functions designed for performance and distribution 
quality in hashing large amounts of data.
- Murmur3_32, Murmur3_128: Non-cryptographic hash functions that provide good distribution and performance. Murmur3_32 
produces a 32-bit hash, while Murmur3_128 produces a 128-bit hash.
- SipHash24: A fast non-cryptographic hash function that's resistant to certain types of hash collision attacks.
```

* **HMAC (Hash-Based Message Authentication Code)**:

```
HmacMd5, HmacSha256, HmacSha512: HMAC algorithms that combine a hash function (e.g., MD5, SHA-256, SHA-512) with a secret 
key to produce a cryptographic message authentication code. These are used for data integrity and authentication in secure communications.
```