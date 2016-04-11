package sz.com.cn.design.single;

public class SingleTest {
	public static void main(String[] args) {
		SingleInstance01 single1 = SingleInstance01.getInstance();
		SingleInstance02 single2 = SingleInstance02.getInstance();
		SingleInstance03 single3 = SingleInstance03.getInstance();
	}

}
