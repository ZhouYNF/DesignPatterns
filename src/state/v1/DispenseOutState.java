package state.v1;

/**
 * 奖品发放完毕的状态
 */
public class DispenseOutState extends State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品已全部发放完毕，请下次再来");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已全部发放完毕，请下次再来");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已全部发放完毕，请下次再来");
    }
}
