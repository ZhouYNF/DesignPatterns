package observer.v1;

/**
 * 定义被观察者的接口
 */
public interface Subject {
     //添加一个观察者
     void registerObserver(Observer o);
     //删除一个观察者
     void removeObserver(Observer o);
     //被观察者推送信息
     void notifyObservers();
}
