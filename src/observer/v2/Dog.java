package observer.v2;

/**
 * 这是一个观察者类
 */
public class Dog implements ObServer {
    private String msg;

    /**
     * 当狗发现小孩哭了，就开始叫
     * @param msg
     */
    @Override
    public void wakeUp(String msg) {
        this.msg = msg;
        display();
    }

    public void display(){
        System.out.println("wangwangwangwang...");
    }
}
