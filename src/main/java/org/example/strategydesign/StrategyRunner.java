package org.example.strategydesign;

public class StrategyRunner {

    public static void main(String[] args) {

        Notification email = new Email(new ZIPCompression(),new RSAEncryption());
        email.compress();
        email.encrypt();
        System.out.println(email);
    }
}