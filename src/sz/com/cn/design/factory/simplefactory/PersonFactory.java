package sz.com.cn.design.factory.simplefactory;

public class PersonFactory {

	public static Person getPerson(int type) {
		if (type == 0) {
			return new Chinese();
		} else if (type == 1) {
			return new Japanise();
		} else {
			return new American();
		}

	}

}
