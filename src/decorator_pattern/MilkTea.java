package decorator_pattern;

/**
 * 这里定义一个奶茶的抽象类
 */
public abstract class MilkTea implements DrinkMilkTea {
    @Override
    public float getTotalprice() {
        return 0;
    }

    @Override
    public String useMaterial() {
        return null;
    }
}
