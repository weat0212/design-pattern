package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/9 下午 02:32
 */
public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.printf("%s Light is On \n", location);
    }

    public void off() {
        System.out.printf("%s Light is Off \n", location);
    }
}
