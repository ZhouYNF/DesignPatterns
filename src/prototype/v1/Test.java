package prototype.v1;

/**
 * 原型模式：使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
 * 浅克隆
 */

public class Test {
    public static void main(String[] args) throws Exception {
        //创建人的类
        Person p1 = new Person();
        //这里克隆对象
        Person p2 = (Person)p1.clone();
        System.out.println(p2.age + " " + p2.score);
        System.out.println(p2.loc);

        //比较人类中地址对象，发现是相同的
        System.out.println(p1.loc == p2.loc);
        p1.loc.street = "sh";
        System.out.println(p2.loc);

    }
}

/**
 * 这里也是一个对象类
 * 想要实现克隆，必须要实现Cloneable接口
 * 和实现clone()方法
 */
class Person implements Cloneable {
    int age = 8;
    int score = 100;

    //创建地址的对象
    Location loc = new Location("bj", 22);

    /**
     * 这里直接继承它原来的方法，不需要实现
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/**
 * 这是一个地址的对象
 */
class Location {
    String street;
    int roomNo;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}