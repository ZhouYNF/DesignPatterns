package iterator.v1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * 用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类
 *    作业：实现LinkedList的Iterator
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
