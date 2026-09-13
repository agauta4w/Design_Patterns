package org.example.strategydesign;

public class Email extends Notification{


    public Email(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        super(compressionStrategy, encryptionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Email");
    }

//    @Override
//    public void encrypt() {
//        System.out.println("AES Encryption");
//    }
//
//    @Override
//    public void compress() {
//        System.out.println("ZIP Compression");
}
