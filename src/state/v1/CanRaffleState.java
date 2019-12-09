package state.v1;

import java.util.Random;

/**
 * 这是一个抽奖的状态
 */
public class CanRaffleState extends State {
    RaffleActivity activity;
    public CanRaffleState(RaffleActivity raffleActivity) {
        this.activity =raffleActivity;
    }

    /**
     * 扣除过不能再扣
     */
    @Override
    public void deductMoney() {
        System.out.println("已扣除过积分，可以以抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！！！");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%中奖机会
        if(num == 0){
            // 改变活动将状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品");
            // 改变抽奖状态
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
