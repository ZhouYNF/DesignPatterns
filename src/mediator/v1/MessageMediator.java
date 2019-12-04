package mediator.v1;


public class MessageMediator implements Mediator {
    private PeopleA a;
    private PeopleB b;
    private PeopleC c;

    public void setA(PeopleA a) {
        this.a = a;
    }

    public void setB(PeopleB b) {
        this.b = b;
    }

    public void setC(PeopleC c) {
        this.c = c;
    }

    /**
     * 这里存放者所有的逻辑
     * @param p
     * @param message
     */
    @Override
    public void chat(People p, String message) {
        //当某一位发出消息时，另外的人都会收到消息
        if (p instanceof PeopleA) {
            a.send(message);
            b.receive(message);
            c.receive(message);
        } else if (p instanceof PeopleB) {
            b.send(message);
            a.receive(message);
            c.receive(message);
        } else if (p instanceof PeopleC) {
            c.send(message);
            a.receive(message);
            b.receive(message);
        }
    }
}


