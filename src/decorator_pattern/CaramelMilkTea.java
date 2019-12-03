package decorator_pattern;

/**
 * 这里实现奶茶的品种
 */
public class CaramelMilkTea extends MilkTea {
    @Override
    public float getTotalprice() {
        return 12;
    }

    @Override
    public String useMaterial() {
        return "焦糖奶茶";
    }
}
