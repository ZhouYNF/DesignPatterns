package decorator_pattern;

/**
 * 这里实现增加的配料
 */
public class Puddin extends MilkTeaMaterial {

    public Puddin(DrinkMilkTea drinkMilkTea) {
        super(drinkMilkTea);
    }

    public float getTotalprice() {
        return drinkMilkTea.getTotalprice() + 2;
    }


    public String useMaterial() {
        return drinkMilkTea.useMaterial() + " 添加：布丁";
    }
}
