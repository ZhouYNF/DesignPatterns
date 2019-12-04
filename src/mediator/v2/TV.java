package mediator.v2;

/**
 * 这是一个电视的家具
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.getName());
    }

    public void StartTv() {

        System.out.println("打开TV");
    }

    public void StopTv() {

        System.out.println("关闭TV!");
    }
}
