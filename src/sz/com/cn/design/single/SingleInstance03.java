package sz.com.cn.design.single;

/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * 
 * @author henry
 */
public class SingleInstance03 {

	private SingleInstance03() {

	}

	private static class InsideSingle {
		public static final SingleInstance03 instance = new SingleInstance03();
	}

	public static SingleInstance03 getInstance() {
		return InsideSingle.instance;
	}

}
