package observer.v1;

/**
 * 观察者的接口
 */
public interface Observer {
    //定义一个改变天气的接口
    void update(float temperature, float pressure, float humidity);
}
