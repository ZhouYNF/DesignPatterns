package bridge;

/**
 * 这里时手机样式的父类
 * 随便组合手机品牌的父类
 * 将这两个维度的东西链接在一起
 */
public class Phone {
    /**
     * 手机品牌的接口
     */
    private Brand brand;

    //传入品牌
    public Phone(Brand brand) {
        this.brand = brand;
    }


    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
