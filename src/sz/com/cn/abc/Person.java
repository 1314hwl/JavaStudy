package sz.com.cn.abc;

public abstract class Person implements Animal {

	public String name;
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("person:�Է�");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("person:˯��");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("person:����");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
