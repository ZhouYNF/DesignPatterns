package command;

public class TVOffCommand implements Command {
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {

        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
