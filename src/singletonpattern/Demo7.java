package singletonpattern;

/**
 * 枚举类
 */
public enum  Demo7 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo7.INSTANCE.hashCode());
            }).start();
        }
    }
}
