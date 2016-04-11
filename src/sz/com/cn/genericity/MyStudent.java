package sz.com.cn.genericity;

/**
 * �Զ��巺���� 1.<>--->��һ����д��ĸ,�����ܼ���֪�� 2.T-->type 3.K,V Key-Value 4.E-->Element
 * ע��:���Ͳ���ʹ���ھ�̬������
 * 
 * @author henry
 *
 * @param <T>
 */
public class MyStudent<T> {
	private T t;

	public MyStudent() {

	}

	public MyStudent(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
