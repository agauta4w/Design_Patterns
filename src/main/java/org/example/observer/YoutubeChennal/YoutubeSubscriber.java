package org.example.observer.YoutubeChennal;

public class YoutubeSubscriber {

    private String name;
    private int id;

    public YoutubeSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void update(String videoTitle, String videoFileName) {
        System.out.println("Update : new video from curiousCoder "+ videoTitle + "Video File : " + videoFileName);
    }

}
