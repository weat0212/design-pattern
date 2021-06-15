package facade;

/**
 * @author I-Chung, Wang
 * @date 2021/6/15 下午 03:25
 */
public class Amplifier {

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        System.out.println("Top-O-Line Amplifier setting DVD");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on");
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
}
