package de.neuefische.mediaplayer;

public class MediaController {

    public void playMedia(Playable playable, String nameOfPlayable) {
        playable.play(nameOfPlayable);
    }
}
