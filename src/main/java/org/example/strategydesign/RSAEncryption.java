package org.example.strategydesign;

public class RSAEncryption implements EncryptionStrategy{
    @Override
    public void encrypt() {
        System.out.println("RSA Encryption");
    }
}
