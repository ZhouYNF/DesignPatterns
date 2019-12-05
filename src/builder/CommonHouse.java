package builder;

/**
 * 建房子的实现类
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("建高墙");
    }

    @Override
    public void roofed() {
        System.out.println("建造屋顶");
    }
}
