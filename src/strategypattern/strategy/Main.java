package strategypattern.strategy;


import java.util.Arrays;

/**
 * comparable
 * comparator
 * 策略模式中，定义算法族，分别封装起来，让他们之间可以 互相替换，此模式让算法的变化独立于使用算法的客户
 * 这算法体现了几个设计原则，第一、把变化的代码从不变的代码中分离出来；
 * 第二、针对接口编程而不是具体类（定义了策略接口）；
 * 第三、多用组合/聚合， 少用继承（客户通过组合方式使用策略
 */
public class Main {
    public static void main(String[] args) {
        Cat[] c= {new Cat(3,6),new Cat(5,5),new Cat(4,2)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(c,new CatComparator());
        //这里随没有返回值，但由于引用类型（包括数组，对象以及接口）作为参数传递时，是把对象在内存中的地址拷贝了一份传给了参数
        //所以当其他地方的其他方法更改的c的数据时，这里的c一会发生更改
        System.out.println(Arrays.toString(c));

        Dog[] d={new Dog(4),new Dog(1),new Dog(9)};
        Sorter<Dog> sorter2 = new Sorter<>();
        sorter2.sort(d,new DogComparator());
        System.out.println(Arrays.toString(d));
    }
}
