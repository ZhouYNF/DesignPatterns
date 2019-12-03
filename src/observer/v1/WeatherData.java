package observer.v1;

import java.util.ArrayList;


/**
 * 这是一个被观察的的实现类
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    //定义一个观察者的集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    //当数据发生改变发起推送消息的方法
    public void dataChange() {
        notifyObservers();
    }

    //被观察者推送信息
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    //添加一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //删除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    //被观察者推送信息
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
