package state.v1;

/**
 * 状态抽象类
 */
public abstract class State {
    // 扣除积分的状态
    public abstract void deductMoney();

    // 是否抽中奖品的状态
    public abstract boolean raffle();

    // 发放奖品的状态
    public abstract  void dispensePrize();

}
