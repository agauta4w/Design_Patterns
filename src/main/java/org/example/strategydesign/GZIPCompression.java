package org.example.strategydesign;

public class GZIPCompression implements CompressionStrategy{
    @Override
    public void compress() {
        System.out.println("GZIP Compression");
    }
}
