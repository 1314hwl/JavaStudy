package sz.com.cn.abc;

public class ChineseMan extends Person {

	
	public int age;
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("ChineseMan:�Է�");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		System.out.println("ChineseMan:˯��");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
		System.out.println("ChineseMan:����");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
