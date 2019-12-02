package factory.simply_factory;

/**
 * 普通人开车
 */
public class Car implements Moveable {
    @Override
    public void go() {
        System.out.println("Car go wuwuwuwuw....");
    }
}
