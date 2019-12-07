package command;

/**
 * 命令模式：将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；
 * 对请求排队或者记录请求日志，以及支持可撤销的操作。
 * 命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式
 *
 * 就是说将电灯聚合到属于电灯的个个操作上，
 * 然后使用电灯的控制器，即遥控器，将这些按钮聚合到这些遥控器的按钮上，
 * 这样就可以使用遥控器来控制电灯
 * 这样的要控制符合开闭原则，即使有新的家电加入也不用更改遥控器，只需要给他选个空白位置即可
 */
public class Client {
    public static void main(String[] args) {

        //创建一个电灯的对象(接受对象)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的开关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //创建一个遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置对象，设置0为电灯
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("---------按下开的按钮----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下关的按钮----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-------按下撤销的按钮----------");
        remoteController.undoButtonWasPushed();

        System.out.println("======使用遥控器控制电视机==============");

        TVReceiver tvReceiver = new TVReceiver();

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);


        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("------电视机打开---------");
        remoteController.onButtonWasPushed(1);
        System.out.println("-------电视机关闭--------");
        remoteController.offButtonWasPushed(1);
        System.out.println("--------电视机撤销-------");
        remoteController.undoButtonWasPushed();
    }
}
