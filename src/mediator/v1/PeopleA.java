package mediator.v1;

public class PeopleA extends People {
    public PeopleA(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("[A] 收到消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("[A] 发出消息：" + message);
    }
}
