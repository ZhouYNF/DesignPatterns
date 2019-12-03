package decorator_pattern;

/**
 * 装饰模式：允许向一个现有的对象添加新的功能，同时又不改变其结构
 *通过将奶茶作为单一变量，与各种配料组合
 * 将奶茶放入配配料中完成组合再拿出来，完成一杯新的奶茶
 */
public class Main {
    public static void main(String[] args) {
        DrinkMilkTea drinkMilkTea = new CaramelMilkTea();
        System.out.println(drinkMilkTea.useMaterial() +",总价："+drinkMilkTea.getTotalprice() );

        drinkMilkTea = new Puddin(drinkMilkTea);
        System.out.println(drinkMilkTea.useMaterial() +",总价："+drinkMilkTea.getTotalprice() );
    }
}
