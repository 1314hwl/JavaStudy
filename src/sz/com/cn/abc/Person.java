package sz.com.cn.abc;

public abstract class Person implements Animal {

	public String name;
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("person:³Ô·¹");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("person:Ë¯¾õ");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("person:½²»°");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
