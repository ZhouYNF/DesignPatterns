package mediator.v2;

/**
 * 这是一窗帘的家具
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.getName());
    }

    public void upCurtains() {
        System.out.println("打开窗帘!");
    }
}
