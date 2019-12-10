package state.money;


/**
 * 各种具体的实现类
 */
//反馈状态
class FeedBackState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}


/**
 * 生成状态
 */
class GenerateState extends AbstractState {

    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}

/**
 * 非支付状态
 */
class NotPayState extends AbstractState {

    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }
}

/**
 * 付费状态
 */
class PaidState extends AbstractState {

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }
}

/**
 * 发布状态
 */
class PublishState extends AbstractState {

    @Override
    public void acceptOrderEvent(Context context) {
        //将当前状态设置为，不能购买的状态
        //要使用哪个状态，有流程图决定
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }
}

/**
 * 审查状态
 */
class ReviewState extends AbstractState {

    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }

}