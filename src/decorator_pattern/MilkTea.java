package decorator_pattern;

/**
 * ���ﶨ��һ���̲�ĳ�����
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
