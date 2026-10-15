package org.example.observer.YoutubeChennal;

public class Runner {
    public static void main(String[] args) {

        YoutubeSubscriber subscriber = new YoutubeSubscriber("Ayush", 1);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("Gautam", 2);
        YoutubeSubscriber subscriber3 = new YoutubeSubscriber("Satish", 3);

        TheCuriousCoder theCuriousCoder = new TheCuriousCoder();
        theCuriousCoder.subscribe(subscriber);
        theCuriousCoder.subscribe(subscriber2);
        theCuriousCoder.subscribe(subscriber3);

       // theCuriousCoder.notifySubscribers();
        theCuriousCoder.uploadVideo(" Observer Pattern " , "Design Pattern");

    }
}
