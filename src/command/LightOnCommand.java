package command;

/**
 * 这是电灯开启命令的实现类
 */
public class LightOnCommand implements Command {
    //聚合电灯的类，
    LightReceiver light;

    /**
     * 构造器
     * @param light
     */
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
