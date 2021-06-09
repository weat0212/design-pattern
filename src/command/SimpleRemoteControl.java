package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/9 下午 02:35
 */
public class SimpleRemoteControl {

    // this is as a slot which can control a device
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
