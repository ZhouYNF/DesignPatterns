package builder;

/**
 * 这是一个指挥者，指挥建造房子的具体过程
 */
public class HouseDirector {
    //定义抽象类
    HouseBuilder houseBuilder = null;

    //应为有了抽象类，所有继承了这个抽象类的都可以出入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //修改实现类
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //实现建造房子的具体流程，然后返回建好的房子
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();

        return houseBuilder.house;
    }
}
