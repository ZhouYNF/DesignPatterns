package state.v1;

/**
 * 只是一个发放奖品的状态
 */
public class DispenseState extends State {
    RaffleActivity activity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能在抽奖了");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRafflleState());
        }else {
            System.out.println("奖品已发送完毕");
            activity.setState(activity.getDispensOutState());
        }


    }
}
