package sz.com.cn.annotation;

@Table("tb_student")
public class StudentInfo {
	@FeildAnno(colName = "id", type = "int", length = 100)
	int id;
	@FeildAnno(colName = "userAge", type = "int", length = 10)
	int age;
	@FeildAnno(colName = "userName", type = "varchar", length = 50)
	String name;

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
