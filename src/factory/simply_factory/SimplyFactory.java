package factory.simply_factory;

/**
 * 简单工厂
 * 将所有建造的方法都放到统一类里，统一管理
 * 缺点：拓展性差
 */
public class SimplyFactory {
    public Moveable createCar() {
        System.out.println("a car created!");
        return new Car();
    }

    public Moveable createBroom() {
        System.out.println("a broom created!");
        return new Broom();
    }
}
