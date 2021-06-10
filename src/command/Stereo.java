package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/10 下午 04:17
 */
public class Stereo {

    int volume;

    public void on() {
        System.out.println("Stereo is On");
    }

    public void off() {
        System.out.println("Stereo is Off");
    }

    public void setCD() {
        System.out.println("Stereo is Set");
    }

    public void setDVD() {
        System.out.println("DVD is Set");
    }

    public void setRadio() {
        System.out.println("Radio is Set");
    }

    public void setVolume(int vol) {
        this.volume = vol;
    }
}
