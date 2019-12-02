package factory.factorymethod;


public class Sub implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA-numberB;
    }
}
