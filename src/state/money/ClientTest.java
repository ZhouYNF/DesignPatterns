package state.money;

public class ClientTest {
    public static void main(String[] args) {

        Context context = new Context();

        context.setState(new PublishState());
        System.out.println(context.getCurrentState());


        context.acceptOrderEvent(context);

        context.payOrderEvent(context);

//        try {
//        	context.checkFailEvent(context);
//        	System.out.println(".");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}

    }
}
