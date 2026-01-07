package br.com.interfaces;

public class Computer implements VideoPlayer, MusicPlayer{

    @Override
    public void playVideo() {
        System.out.println("O player está tocando um vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O player pausou o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O player parou o vídeo");
    }

    @Override
    public void playMusic() {
        System.out.println("O player está tocando uma música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O player pausou a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O player parou a música");
    }

}
