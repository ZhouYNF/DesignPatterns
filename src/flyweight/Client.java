package flyweight;

/**
 * 享元模式：运 用共享技术有效地支持大量细粒度的对象，享元模式能够解决重复对象的内存浪费的问题
 *
 * 就是创建时先去询问池里是否有我已经创建过的对象，如果有就直接拿出来用，没有再去创建
 * 与字符串的存放是一样的，
 */
public class Client {

	public static void main(String[] args) {
		//创建一个工厂类
		WebSiteFactory factory = new WebSiteFactory();

		//从工厂类中获取一个类型名叫新闻的网站
		WebSite webSite1 = factory.getWebSiteCategory("新闻");
		//然后使用
		webSite1.use(new User("tom"));


		WebSite webSite2 = factory.getWebSiteCategory("博客");

		webSite2.use(new User("jack"));


		WebSite webSite3 = factory.getWebSiteCategory("博客");

		webSite3.use(new User("smith"));


		WebSite webSite4 = factory.getWebSiteCategory("博客");

		webSite4.use(new User("king"));
		
		System.out.println("创建类型的数量：" + factory.getWebSiteCount());
	}

}
