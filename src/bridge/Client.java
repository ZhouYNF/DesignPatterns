package bridge;


/**
 * 桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 *
 * 就是说两个维度的东西，如果都直接组合出来，就有可能导致类爆炸，既然如此那就先不组合
 * 先把他们的父类传入，要用时再把他传进入
 *
 * 比如说手机的样式，折叠，直立的
 * 品牌有小米，vivo。。。
 * 直接组合就是n*m个组合
 * */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("=======================");

        Phone phone2 = new FoldedPhone(new Vivo());

        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("==============");

        UpRightPhone phone3 = new UpRightPhone(new XiaoMi());

        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("==============");

        UpRightPhone phone4 = new UpRightPhone(new Vivo());

        phone4.open();
        phone4.call();
        phone4.close();
    }
}
