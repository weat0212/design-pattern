package facade;

/**
 * @author I-Chung, Wang
 * @date 2021/6/15 下午 03:27
 */
public class TheaterLights {
    
    public void dim(int lightness) {
        System.out.println("Theater Lights dimming to " + lightness + "%");
    }

    public void on() {
        System.out.println("Theater Lights on");
    }
}
