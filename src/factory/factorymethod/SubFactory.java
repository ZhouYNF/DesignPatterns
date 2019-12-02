package factory.factorymethod;

public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}
