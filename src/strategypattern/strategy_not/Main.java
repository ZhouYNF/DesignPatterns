package strategypattern.strategy_not;

import java.util.Arrays;

/**
 * 再没有使用策略模式，在传统模式下，如果需要在对猫的高度进行排序，需要写重复的代码
 * 所以在我们需要提取其中不变的代码，进行封装
 */
public class Main {
    public static void main(String[] args) {
        Cat[] c= {new Cat(3,6),new Cat(5,5),new Cat(4,2)};
        Sorter sorter = new Sorter();
        sorter.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
