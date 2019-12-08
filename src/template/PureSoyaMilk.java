package template;

/**
 * 纯豆浆
 *
 * 钩子函数：
 * 在模板方法模式的父类中，我们可以定义一个方法
 * 它默认不做任何事，子类可以 视情况要不要覆盖它，该方法称为“钩子”。
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        //不加入配料
        System.out.println("不加入配料");
    }

    /**
     * 钩子函数
     * @return
     */
    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
