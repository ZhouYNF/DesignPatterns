package builder;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打深地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("建造高墙");
    }

    @Override
    public void roofed() {
        System.out.println("建造华丽的屋顶");
    }
}
