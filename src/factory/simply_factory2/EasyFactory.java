package factory.simply_factory2;

public class EasyFactory {
    private static Operation operationObj = null;

    private static Operation add(){
        System.out.println("加法运算");
        return new Add();
    }
    private static Operation sub(){
        System.out.println("减法运算");
        return new Sub();
    }
    private static Operation mul(){
        System.out.println("乘法运算");
        return new Mul();
    }
    private static Operation div(){
        System.out.println("除法运算");
        return new Div();
    }

    // 简单工厂，根据字符串创建相应的对象
    public static Operation createOperation(String name) {

        switch (name) {
            case "+":
                operationObj = add();
                break;
            case "-":
                operationObj = sub();
                break;
            case "*":
                operationObj = mul();
                break;
            case "/":
                operationObj = div();
                break;
        }
        return operationObj;
    }

}
