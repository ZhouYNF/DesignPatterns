package observer.v2;

import java.util.ArrayList;

/**
 * 这是被观察的小孩类
 */
public class Child {
    private String msg;

    public ArrayList<ObServer> obServers;

    public Child() {
        obServers = new ArrayList<>();
    }

    //当小孩发出声音时，观察则就会收到消息
    public void updata(String msg){
        this.msg = msg;
        notifyObservers();
    }

    //添加一个观察者
    void registerObserver(ObServer o){
        obServers.add(o);
    };
    //删除一个观察者
    void removeObserver(ObServer o){
        obServers.remove(o);
    };
    //被观察者推送信息
    void notifyObservers(){
        for (ObServer obServer : obServers) {
            obServer.wakeUp(msg);
        }
    };
}
