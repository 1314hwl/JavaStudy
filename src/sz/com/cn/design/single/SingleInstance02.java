package sz.com.cn.design.single;

/**
 * ����ʽlazy load:��Դ�����ʸ�,����,ÿ�ε���getInstance()������Ҫͬ��,����Ч�ʲ���
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
