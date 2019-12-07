package bridge;

/**
 * 手机品牌的实现类
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("打开vivo手机");
    }

    @Override
    public void close() {
        System.out.println("关闭vivo手机");
    }

    @Override
    public void call() {
        System.out.println("使用vivo手机打电话");
    }
}
