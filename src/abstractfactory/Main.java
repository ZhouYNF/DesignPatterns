package abstractfactory;

/**
 * 抽象工厂
 * 形容词用接口，名词用抽象类
 */
public class Main {
    public static void main(String[] args) {
        AbastractFactory factory = new ModernFactory();
        Vehicle v = factory.createVehicle();
        v.go();
        Weapon w = factory.createWeapon();
        w.shoot();
        Food f = factory.createFood();
        f.printName();

    }

}
