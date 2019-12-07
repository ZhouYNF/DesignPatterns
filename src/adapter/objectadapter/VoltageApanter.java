package adapter.objectadapter;

/**
 * 这是一个适配器的实现类
 */
public class VoltageApanter implements IVoltage5V {
    private Voltage220V voltage220V;

    /**
     * 将对象传入
     * @param voltage220V
     */
    public VoltageApanter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 这是一个电压转化的方法
     * @return
     */
    @Override
    public int output5V() {
        //获取220V的电压
        int srcV = voltage220V.output220V();
        //电压转换
        srcV = srcV/44;
        return srcV;
    }
}