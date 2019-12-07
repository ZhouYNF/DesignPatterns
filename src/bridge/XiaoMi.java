package bridge;

/**
 * 手机品牌的实现类
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("打开小米手机");
    }

    @Override
    public void close() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void call() {
        System.out.println("用小米手机打电话");
    }
}
