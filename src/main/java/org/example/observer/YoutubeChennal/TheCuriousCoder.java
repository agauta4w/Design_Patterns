package org.example.observer.YoutubeChennal;

import java.util.ArrayList;
import java.util.List;

public class TheCuriousCoder {

    private String videoTitle;
    private String videoFileName;

    List<YoutubeSubscriber> subscriberList = new ArrayList<>();

    public  void subscribe(YoutubeSubscriber sub){
        subscriberList.add(sub);
    }

    public void notifySubscribers(){

        for(YoutubeSubscriber subscriber : subscriberList){
            subscriber.update(videoTitle, videoFileName);
        }
    }

    public void uploadVideo(String videoTitle, String videoFileName){
        this.videoTitle = videoTitle;
        this.videoFileName = videoFileName;

        System.out.println("New video has been uploaded" + videoTitle + videoFileName);
        notifySubscribers();
    }
}
