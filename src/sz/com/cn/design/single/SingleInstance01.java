package sz.com.cn.design.single;

/**
 * 饿汉式: 优点:线程安全,调用效率高;缺点:无延时加载
 * 
 * @author henry
 */
public class SingleInstance01 {

	private static SingleInstance01 INSTANCE = new SingleInstance01();// 静态对象,天然的线程安全,加载类时是线程安全的

	private SingleInstance01() {

	}

	public static SingleInstance01 getInstance() {
		return INSTANCE;
	}

}
