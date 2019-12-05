package builder;

/**
 *这是建造房子的抽象类
 */
public abstract class HouseBuilder {
    //将房子的实体类聚合到抽象类中
    protected House house = new House();

    //建造房子的具体操作
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    //返回建造好的房子
    public House buildHouse() {
        return house;
    }
}
