package singletonpattern;


/**
 * 懒汉模式
 * lazy loading
 * 可以不初始化，但会线程不安全
 */
public class Demo3 {
    private static Demo3 instance ;

    private Demo3() { }

    public static Demo3 getInstance(){
        if (instance == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Demo3();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo3.getInstance().hashCode());
            }).start();
        }
    }

}
