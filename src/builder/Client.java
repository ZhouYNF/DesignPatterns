package builder;

/**
 * 建造者模式
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式是一种对象创建型模式。
 */
public class Client {
    public static void main(String[] args) {
        //建造房子的具体实现类
        CommonHouse commonHouse = new CommonHouse();

        //将实现类，传给指挥者，告诉他要建造怎样房子
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //指挥者有自己建造房子的过程，然后返回给你，你需要的房子
        House house = houseDirector.constructHouse();

        System.out.println("<=============================================>");
        houseDirector.setHouseBuilder(new HighBuilding());

        houseDirector.constructHouse();
    }
}
