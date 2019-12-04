package mediator.v2;

/**
 * 这是一个咖啡机的家具类
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.getName());
    }

    public void StartCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
