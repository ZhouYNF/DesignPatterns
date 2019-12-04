package mediator.v2;

public class ClientTest {
    public static void main(String[] args) {
        //先NEW一个中介者
        Mediator mediator = new ConcreteMediator();

        //在new一个报警器，加入到中介者实现类的map对象中
        Alarm alarm = new Alarm(mediator, "alarm");

        //new一个咖啡机加入到中介者实现类的map对象中
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
                "coffeeMachine");

        //new一个窗帘加入到中介者实现类的map对象中
        Curtains curtains = new Curtains(mediator, "curtains");
        //new 一个电视加入到中介者实现类的map对象中
        TV tV = new TV(mediator, "TV");

        //开启报警
        alarm.SendAlarm(0);
        //运行咖啡机
        coffeeMachine.FinishCoffee();
        //关闭报警
        alarm.SendAlarm(1);
    }
}
