package prototype.v2;

/**
 * 深克隆的处理
 *
 * 当我们要对克隆对象进行克隆时
 * 如果克隆对象中有还有对象那么克隆对象中的对象就会都指向同一引用
 * 所以我们要进行深度的克隆
 *
 *
 * 需要解决这个问题也很简单
 * 只需要对更深对象也进行克隆便可以
 * */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person)p1.clone();
        System.out.println(p2.age + " " + p2.score);
        System.out.println(p2.loc);

        System.out.println(p1.loc == p2.loc);
        p1.loc.street = "sh";
        System.out.println(p2.loc);

    }
}

class Person implements Cloneable {
    int age = 8;
    int score = 100;

    Location loc = new Location("bj", 22);
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        p.loc = (Location)loc.clone();
        return p;
    }
}

class Location implements Cloneable {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
