package observer.v2;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        Dog dog = new Dog();
        child.registerObserver(dog);
        child.updata("aaaaaaaaa");

    }
}
