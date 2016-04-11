package sz.com.cn.reflex;

public class User {
	int id;
	int age;
	String name;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
