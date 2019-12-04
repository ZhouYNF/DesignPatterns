package flyweight;

import java.util.HashMap;


/**
 * 网站的工厂类，返回所需要的网站
 */
public class WebSiteFactory {

	//集合，充当池的使用
	private HashMap<String, ConcreteWebSite> pool = new HashMap<>();
	
	//更据网站的类型，返回网站，如果没有就创建一个网站，并放入到池中，斌返回
	public WebSite getWebSiteCategory(String type) {
		if(!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebSite(type));
		}
		
		return (WebSite)pool.get(type);
	}


	/**
	 * 返回使用过的网站的分类的总数
	 * @return
	 */
	public int getWebSiteCount() {
		return pool.size();
	}
}
