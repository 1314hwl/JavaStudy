package sz.com.cn.abc;

import java.lang.reflect.GenericArrayType;

public class Test extends BaseTest {

	public static void main(String[] args) {
		// ChineseMan cMan = new ChineseMan();
		// cMan.eat();
		// cMan.speak();
		// cMan.sleep();
		// method("1", "2", "4");
		Test t = new Test();
		Person p = t.getPerson();
		if(p instanceof ChineseMan){
			System.out.println(p.toString());
		}else if(p instanceof Person){
			System.out.println(p.toString());
		}

	}

	private static void method(String... name) {
		// for (String s : name) {
		// System.out.println(s);
		// }

		// for (int i = 0; i < name.length; i++) {
		// System.out.println(name[i]);
		// }
		// ±éÀúÃ¶¾Ù
		

	}

	@Override
	protected Person getPerson() {
		ChineseMan cMan = new ChineseMan();
		cMan.setAge(455);
		cMan.setName("test");
		return cMan;
	}

	// public abstract void test();

}
