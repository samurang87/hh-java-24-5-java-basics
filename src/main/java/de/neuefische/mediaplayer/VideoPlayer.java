package de.neuefische.mediaplayer;

public class VideoPlayer implements Playable {

    @Override
    public void play(String nameOfVideo) {
        System.out.println("\uD83C\uDF7F Playing " + nameOfVideo + " \uD83C\uDF7F");
    }
}
