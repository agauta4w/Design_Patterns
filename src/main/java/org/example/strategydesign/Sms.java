package org.example.strategydesign;

public class Sms extends Notification{

    public Sms(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        super(compressionStrategy, encryptionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }

//    @Override
//    public void encrypt() {
//        System.out.println("AES Encryption");
//    }
//
//    @Override
//    public void compress() {
//        System.out.println("GZIP Compression");
//    }
}
