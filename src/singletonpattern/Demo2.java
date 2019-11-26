package singletonpattern;

/**
 * 和demo1一样
 */
public class Demo2 {
    private static final Demo2 INSTANCE;

    static {
        INSTANCE = new Demo2();
    }

    private Demo2(){};

    public static Demo2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Demo2 m1  = Demo2.getInstance();
        Demo2 m2 =  Demo2.getInstance();
        System.out.println(m1 == m2);
    }
}
