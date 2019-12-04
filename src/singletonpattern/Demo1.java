package singletonpattern;

/**
 * 单例模式，是整个程序有且只有一个实例，即使有一个对象。
 * 饿汉式
 *类加载到内存后，就实例化一个单例对象，JVM保证线程安全
 * 缺点：不管使用与否，类装载时就会被实例化
 *
 * 
 */
public class Demo1 {
    private static final Demo1 demo = new Demo1();

    private Demo1(){};

    public static Demo1 getDemo(){ return demo;}

    public static void main(String[] args) {
        Demo1 m1  = Demo1.getDemo();
        Demo1 m2 =  Demo1.getDemo();
        System.out.println(m1 == m2);
    }
}
