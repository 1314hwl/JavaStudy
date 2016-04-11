package sz.com.cn.genericity;

/**
 * 自定义泛型类 1.<>--->是一个大写字母,尽可能见名知意 2.T-->type 3.K,V Key-Value 4.E-->Element
 * 注意:泛型不能使用在静态属性上
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
