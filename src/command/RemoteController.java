package command;

/**
 * 这是遥控器的控制类，即命令
 */
public class RemoteController {

    //开按钮的命令的数组
    Command[] onCommands;
    //关按钮命令的数组
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {

        //遥控器的开的按钮数量
        onCommands = new Command[5];
        //遥控器的关的按钮数量
        offCommands = new Command[5];

        //将全部都初始化，都置为空
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开的按钮
    public void onButtonWasPushed(int no) {

        //找到你按下的按钮，并调用相关的方法
        onCommands[no].execute();

        //记录这次的操作，用于撤回
        undoCommand = onCommands[no];

    }

    //按下关的按钮
    public void offButtonWasPushed(int no) {

        offCommands[no].execute();

        undoCommand = offCommands[no];

    }

    //按下撤销的按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
