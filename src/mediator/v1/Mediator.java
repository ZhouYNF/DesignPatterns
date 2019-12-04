package mediator.v1;

/**
 *  这是中介者的接口
 */
public interface Mediator {
    /**
     * 发送消息
     * @param p
     * @param message
     */
    void chat(People p,String message);


}
