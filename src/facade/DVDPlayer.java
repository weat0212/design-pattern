package facade;

/**
 * @author I-Chung, Wang
 * @date 2021/6/15 下午 03:27
 */

public class DVDPlayer {

    String movie;

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Top-O-Line DVD Player playing \"" + this.movie + "\"");
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped \"" + this.movie + "\"");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
}
