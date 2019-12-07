package command;

/**
 * 他没有任何命令，即空执行；
 * 用于初始化每一个按钮
 * 当调用空命令，对象什么都不做
 *
 * 一开始都设置为空，就可以省去接下来的判断，
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
