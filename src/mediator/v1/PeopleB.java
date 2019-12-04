package mediator.v1;

public class PeopleB extends People {


    public PeopleB(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("[B] 收到消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("[B] 发出消息：" + message);
    }
}
