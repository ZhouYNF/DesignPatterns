package iterator.v1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * 迭代器模式：用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类
 *
 *
 * 迭代器模式是通过将聚合对象的遍历行为分离出来，抽象成迭代器类来实现的，
 * 其目的是在不暴露聚合对象的内部结构的情况下，
 * 让外部代码透明地访问聚合的内部数据。
 */

public class Main {
    public static void main(String[] args) {

        Collection_<String> list = new LinkedList_<>();
        for(int i=0; i<15; i++) {
            list.add(new String("s" + i));
        }

        int size = list.size();
        System.out.println(size);
        //这个接口的调用方式：
        Iterator_<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String o = iterator.next();
            System.out.println(o);
        }
    }
}
