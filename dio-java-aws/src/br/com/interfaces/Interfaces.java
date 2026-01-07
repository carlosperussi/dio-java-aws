package br.com.interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();
        
        playMusic(musicPlayer);
        playVideo(musicPlayer);
    }

    public static void playVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void playMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
