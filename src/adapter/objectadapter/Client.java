package adapter.objectadapter;

/**
 * 对象适配器模式
 *
 * 取消继承，直接将220V的电压，聚合到适配器中
 *
 */
public class Client {
    public static void main(String[] args) {
        //创建一个使用适配器的手机
        Phone phone = new Phone();
        //使用充电的方法，将充电的适配器给他,
        phone.charging(new VoltageApanter(new Voltage220V()));
    }
}
