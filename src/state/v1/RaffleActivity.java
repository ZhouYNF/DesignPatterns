package state.v1;

/**
 * 抽奖活动
 */
public class RaffleActivity {
    RaffleActivity activity;

    //state 当前的活动的状态
    State state = null;

    //奖品数量
    int count = 0;

    //不能抽奖的状态
    State noRafflleState = new NoRaffleState(this);
    //可以抽奖的状态
    State canRaffleState = new CanRaffleState(this);
    //这是一个发放奖品的状态
    State dispenseState = new DispenseState(this);
    //这是一个奖品已全部发放完成的状态
    State dispensOutState = new DispenseOutState(this);


    //构造器，初始化当前的状态为noRafflleState，不能抽奖的状态
    public RaffleActivity(int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //调用，当前状态的deductMoney
    public void debuctMoney() {
        state.deductMoney();
    }


    /**
     * 抽奖
     */
    public void raffle() {
        //如果当前状态为抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    /**
     * 奖品领完后，奖品数量减少
     *
     * @return
     */
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
