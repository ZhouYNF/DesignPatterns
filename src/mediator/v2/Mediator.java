package mediator.v2;

/**
 * 中介者模式的抽象类
 */
public abstract class Mediator {
    //接收家具放到中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接受消息，由具体的家具发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
