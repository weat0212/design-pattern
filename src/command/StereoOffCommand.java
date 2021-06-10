package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/10 下午 04:23
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
