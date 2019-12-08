package template;

/**
 * 模板模式
 * 在一个抽象类公开定义了执行它的方法的模板。它的子类可以按需要重写方法 实现，但调用将以抽象类中定义的方式进行
 *
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----制作红豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作黄豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("----纯豆浆----");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
