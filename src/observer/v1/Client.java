package observer.v1;

/**
 * 观察者模式（又被称为发布-订阅（Publish/Subscribe）模式，
 * 属于行为型模式的一种，它定义了一种一对多的依赖关系，
 * 让多个观察者对象同时监听某一个主题对象。这个主题对象在状态变化时，
 * 会通知所有的观察者对象，使他们能够自动更新自己。
 */
public class Client {
    public static void main(String[] args) {
        //这是一个被观察者
        WeatherData weatherData = new WeatherData();
        //这是一个观察者
        CurrentConditions currentConditions = new CurrentConditions();
        //当观察者放入被观察者中，即订阅消息一样
        weatherData.registerObserver(currentConditions);

        System.out.println("=======================》");
        //每当被观察的数据变化了，观察者即立刻就能获得消息
        weatherData.setData(10f, 100f, 30.3f);
    }
}
