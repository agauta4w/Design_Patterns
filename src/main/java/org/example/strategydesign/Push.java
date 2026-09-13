package org.example.strategydesign;

public class Push extends Notification{

    public Push(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        super(compressionStrategy, encryptionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }

//    @Override
//    public void encrypt() {
//        System.out.println("RSA Encryption");
//    }
//
//    @Override
//    public void compress() {
//        System.out.println("ZIP Compression");
//    }
}
