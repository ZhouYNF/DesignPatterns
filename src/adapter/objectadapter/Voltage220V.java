package adapter.objectadapter;

/**
 * 被适配的类
 */
public class Voltage220V {
    //原来的电压
    public int output220V(){
        int src = 220 ;
        System.out.println("当前电压为"+src+"V");
        return src;
    }
}
