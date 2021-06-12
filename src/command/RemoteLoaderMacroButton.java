package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/10 下午 04:30
 */
public class RemoteLoaderMacroButton {

    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose= new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] smartButtonOn = {lightOn, stereoOnWithCD, garageDoorOpen, ceilingFanOn};
        Command[] smartButtonOff = {lightOff, stereoOff, garageDoorClose, ceilingFanOff};

        MacroCommand smartButtonOnMacro = new MacroCommand(smartButtonOn);
        MacroCommand smartButtonOffMacro = new MacroCommand(smartButtonOff);

        remoteControl.setCommand(0, smartButtonOnMacro, smartButtonOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
