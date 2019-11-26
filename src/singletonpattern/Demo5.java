package singletonpattern;

/**
 * 懒汉模式+加锁+双重检查
 */
public class Demo5 {
    private static Demo5 instance;

    private Demo5() {
    }

    public static Demo5 getInstance() {
        if (instance == null) {
            //加锁
            synchronized (Demo5.class) {
                //双重检查
                if (instance == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Demo5();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo5.getInstance().hashCode());
            }).start();
        }
    }
}
