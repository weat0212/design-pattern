package command;

/**
 * @author I-Chung, Wang
 * @date 2021/6/12 下午 02:28
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {

        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
