package flyweight;


/**
 * 具体网站
 */
public class ConcreteWebSite extends WebSite {

	//共享的部分，
	private String type = "";//网站的发布形式


	public ConcreteWebSite(String type) {
		
		this.type = type;
	}


	@Override
	public void use(User user) {

		System.out.println("网站的发布形式为 " + type + "在使用中，使用者" + user.getName());
	}
	
	
}
