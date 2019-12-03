package observer.v1;

/**
 * 这是一个观察者的实现类
 *
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 每当有人推送消息，即调用方法就，观察者也就能都收到信息
     * @param temperature
     * @param pressure
     * @param humidity
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
