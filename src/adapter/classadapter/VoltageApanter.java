package adapter.classadapter;

/**
 * 这是一个适配器的实现类
 */
public class VoltageApanter extends Voltage220V implements IVoltage5V  {
    /**
     * 这是一个电压转化的方法
     * @return
     */
    @Override
    public int output5V() {
        //获取220V的电压
        int srcV = output220V();
        //电压转换
        srcV = srcV/44;
        return srcV;
    }
}