package factory.simply_factory;

public class Main {
    public static void main(String[] args) {
        Moveable moveable = new SimplyFactory().createCar();
        moveable.go();
    }


}
