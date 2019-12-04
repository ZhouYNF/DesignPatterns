package visitor;

/**
 * 访问者模式：表示一个作用于某对象结构中各个元素的操作。它使你可以在不改变各元素的前提下定义作用于这些元素的新操作。
 *这样购买的方案就可以不在冗余的增加；
 * 只适用于内部不再增加新的类
 */
public class Main {
    public static void main(String[] args) {

        //创建一个购买方法
        PersonelVisitor p = new PersonelVisitor();
        //将购买方法聚合到电脑类中
        new Computer().acccept(p);
        //输出价格
        System.out.println(p.totalPrice);

    }
}
