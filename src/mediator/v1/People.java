package mediator.v1;

/**
 * 这是一个同事的抽象类
 */
public abstract class People {
    private String name;
    private Mediator mediator;

    public People(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    /**
     * 收到消息
     * @param message
     */
    public abstract void receive(String message);

    /**
     * 发出消息
     * @param message
     */
    public abstract void send(String message);
}
