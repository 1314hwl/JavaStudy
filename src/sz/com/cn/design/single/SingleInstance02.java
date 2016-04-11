package sz.com.cn.design.single;

/**
 * 懒汉式lazy load:资源利用率高,但是,每次调用getInstance()方法都要同步,并发效率不高
 * 
 * @author henry
 */
public class SingleInstance02 {

	private static SingleInstance02 instance;

	private SingleInstance02() {

	}

	public static synchronized SingleInstance02 getInstance() {
		if (null == instance) {
			instance = new SingleInstance02();
		}
		return instance;
	}

}
