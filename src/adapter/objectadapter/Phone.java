package adapter.objectadapter;

/**
 * 这是一个使用适配器的类
 */
public class Phone {
    /**
     * 这是一个充电调用适配器的方法
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压适配，可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("超过5V，不能充电");
        }
    }
}
