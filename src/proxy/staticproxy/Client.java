package proxy.staticproxy;

/**
 * 代理模式
 * 代理模式：为一个对象提供一个替身，以控制对这个对象的访问。
 * 即通过代理 对象访问目标对象.这样做的好处是:可以在目标对象实现的基础上,增强额外的 功能操作,即扩展目标对象的功能。
 *
 * 这里使用的时静态代理，将需要使用的对象，通过接口的模式，
 * 把自己的交给代理对象，有代理对象来进行操作
 *
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象, 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
