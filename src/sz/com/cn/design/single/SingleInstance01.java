package sz.com.cn.design.single;

/**
 * ����ʽ: �ŵ�:�̰߳�ȫ,����Ч�ʸ�;ȱ��:����ʱ����
 * 
 * @author henry
 */
public class SingleInstance01 {

	private static SingleInstance01 INSTANCE = new SingleInstance01();// ��̬����,��Ȼ���̰߳�ȫ,������ʱ���̰߳�ȫ��

	private SingleInstance01() {

	}

	public static SingleInstance01 getInstance() {
		return INSTANCE;
	}

}
