package br.com.interfaces;

public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O MusicBox está tocando uma música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O MusicBox pausou a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O MusicBox parou a música");
    }

}
