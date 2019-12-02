package factory.factorymethod;

public class AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
