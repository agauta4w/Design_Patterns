package org.example.strategydesign;

public abstract class Notification {

    CompressionStrategy compressionStrategy;
    EncryptionStrategy encryptionStrategy;

    public Notification(CompressionStrategy compressionStrategy, EncryptionStrategy encryptionStrategy) {
        this.compressionStrategy = compressionStrategy;
        this.encryptionStrategy = encryptionStrategy;
    }

    abstract void send();

    void encrypt(){
        encryptionStrategy.encrypt();
    }

    void compress(){
        compressionStrategy.compress();
    }
}
