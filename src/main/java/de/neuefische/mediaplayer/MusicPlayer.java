package de.neuefische.mediaplayer;

public class MusicPlayer implements Playable {

    @Override
    public void play(String songName) {
        System.out.println("\uD83C\uDFB6 Playing " + songName + " \uD83C\uDFB6");
    }
}
