package state.v1;

/**
 *不能抽奖的状态
 */
public class NoRaffleState extends State{
    //初始化时存入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除后，有状态时将设置可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除积分成功");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("积分扣除成功才能抽奖");
        return false;
    }

    /**
     * 当前状态不能领取奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
