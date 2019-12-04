package mediator.v1;

public class PeopleC extends People {

    public PeopleC(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("[C] 收到消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("[C] 发出消息：" + message);
    }
}
