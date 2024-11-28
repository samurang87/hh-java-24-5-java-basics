package de.neuefische;

import de.neuefische.mediaplayer.MediaController;
import de.neuefische.mediaplayer.MusicPlayer;
import de.neuefische.mediaplayer.Playable;
import de.neuefische.mediaplayer.VideoPlayer;

public class Main {
    public static void main(String[] args) {

        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(musicPlayer, "Jingle Bells");
        mediaController.playMedia(videoPlayer, "Home Alone");
    }
    }
