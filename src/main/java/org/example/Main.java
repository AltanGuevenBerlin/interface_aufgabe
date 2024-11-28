package org.example;

public class Main {

    public static void main(String[] args) {
        Playable myMusicPlayer = new MusicPlayer();
        Playable myVideoPlayer = new VideoPlayer();

        MediaController myController = new MediaController();
        myController.playMedia(myMusicPlayer);
        myController.playMedia(myVideoPlayer);

    }
}