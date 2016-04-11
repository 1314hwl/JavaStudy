package sz.com.cn.design.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
		Person person = PersonFactory.getPerson(100);
		person.name();

	}

}
