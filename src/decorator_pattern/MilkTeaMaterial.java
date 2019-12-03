package decorator_pattern;

/**
 * ���ﶨ���������ϵĳ�����
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
