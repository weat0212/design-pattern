package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/9 下午 02:31
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Receiver call on() method
        light.off();
    }
}
