package mediator.v1;

/**
 * 中介者模式包装了一系列对象相互作用的方式，使得这些对象不必相互明显作用。从而使它们可以松散耦合。
 * 当某些对象之间的作用发生改变时，不会立即影响其他的一些对象之间的作用。保证这些作用可以彼此独立的变化
 *
 * 也就是说所有人只对中介者负责，中介者调理好所有关系
 *
 *
 * 优点：
 *
 * 简化了对象之间的交互，它用中介者和同事的一对多交互代替了原来同事之间的多对多交互，
 * 一对多关系更容易理解、维护和扩展，将原本难以理解的网状结构转换成相对简单的星型结构。
 * 各同事对象之间解耦：中介者有利于各同事之间的松耦合，我们可以独立的改变和复用每一个同事和中介者，
 * 增加新的中介者和新的同事类都比较方便，更好地符合“开闭原则”。
 *
 *
 * 缺点：中介者会庞大，变得复杂难以维护。
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        MessageMediator mediator = new MessageMediator();
        PeopleA a = new PeopleA("A",mediator);
        PeopleB b = new PeopleB("B",mediator);
        PeopleC c = new PeopleC("C",mediator);

        mediator.setA(a);
        mediator.setB(b);
        mediator.setC(c);

        mediator.chat(a,"中午吃啥饭？");
        System.out.println();
        mediator.chat(b, "我想是豆腐");
        System.out.println();
        mediator.chat(c,"行，一起吃豆腐");
        System.out.println();

    }
}
