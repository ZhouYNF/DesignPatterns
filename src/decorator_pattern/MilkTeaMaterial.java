package decorator_pattern;

/**
 * 这里定义增加配料的抽象类
 */
public abstract class MilkTeaMaterial implements DrinkMilkTea {
    public DrinkMilkTea drinkMilkTea;

    public MilkTeaMaterial(DrinkMilkTea drinkMilkTea){
            this.drinkMilkTea = drinkMilkTea;
    }

    @Override
    public float getTotalprice() {
        return drinkMilkTea.getTotalprice();
    }

    @Override
    public String useMaterial() {
        return drinkMilkTea.useMaterial();
    }
}
