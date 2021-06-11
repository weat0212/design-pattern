package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/10 下午 04:32
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        getSpeed();
    };

    public void medium() {
        speed = MEDIUM;
        getSpeed();
    };

    public void low() {
        speed = LOW;
        getSpeed();
    };

    public void off() {
        speed = OFF;
        getSpeed();
    };

    public int getSpeed() {
        System.out.println(location + "Ceiling Fan is on " + speed);
        return speed;
    }
}
