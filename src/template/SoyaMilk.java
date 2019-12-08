package template;

/**
 * 制作豆浆的抽象类，所有公共的方法抽离
 *
 */
public abstract class SoyaMilk {
    //模板方法，make，模板方法做成final，不让子类去覆盖
    final void make() {
        select();
        //判断是否需要加入配料
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();

    }

    //选材料
    void select() {
        System.out.println("选取新鲜的豆子");
    }

    //加入不同的配料，抽象方法，子类去实现
    abstract void addCondiments();

    //浸泡，
    void soak() {
        System.out.println("豆子和配料一起浸泡");
    }

    void beat() {
        System.out.println("豆子和配料打碎，成为豆浆");
    }

    //钩子函数，决定是否需要添加配料
    boolean customerWantCondiments() {
        return true;
    }
}
