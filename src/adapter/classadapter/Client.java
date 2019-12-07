package adapter.classadapter;

/**
 * 类适配器模式
 *
 * 将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，
 * 其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 *
 * 在类适配器模式中，适配器与适配者之间是继承（或实现）关系
 */
public class Client {
    public static void main(String[] args) {
        //创建一个使用适配器的手机
        Phone phone = new Phone();
        //使用充电的方法，将充电的适配器给他
        phone.charging(new VoltageApanter());
    }
}
