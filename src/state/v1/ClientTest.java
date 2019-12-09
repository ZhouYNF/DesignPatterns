package state.v1;

/**
 *  状态模式（State Pattern）：
 *  1)它主要用来解决对象在多种状态转换时，需要对外 输出不同的行为的问题。状态和行为是一一对应的，状态之间可以相互转换
 *  2) 当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了 其类
 *
 *
 * 就是说他都继承同一个抽象类或接口，开始时，放入不能抽奖状态，
 * 调用抽奖状态后，将可以抽奖的状态传入，
 * 抽中后再将获奖的状态传入，如果没有将最开始的状态传入
 * 通过继承或实现能力不断转化当前的状态
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建抽奖活动，并设置奖品数量
        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            //参与抽奖，先扣除积分
            activity.debuctMoney();
            //在抽奖
            activity.raffle();
        }
    }
}
