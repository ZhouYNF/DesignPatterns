package command;

/**
 * 操作命令的接口
 */
public interface Command {
    //执行动作(操作)
    void execute();
    //撤销动作
    void undo();
}
