package mediator.v2;

/**
 * 这是一个报警的家具
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在 创建Alarm 家具对象时，将自己放到ConcreateMediator 对象中
        mediator.Register(name, this);
    }
    public void SendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    //获取到中介者中介者对象的getMessage
    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.getName());
    }
}
