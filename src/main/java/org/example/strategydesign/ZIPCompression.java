package org.example.strategydesign;

public class ZIPCompression implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("ZIP Compression");
    }
}
