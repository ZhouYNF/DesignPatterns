package singletonpattern;

/**
 * 懒汉模式+加锁
 */
public class Demo4 {
    private static volatile Demo4 instance ; //JIT

    private Demo4() { }

    public static synchronized Demo4 getInstance(){
        if (instance == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Demo4();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo4.getInstance().hashCode());
            }).start();
        }
    }
}
