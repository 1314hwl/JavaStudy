package sz.com.cn.reflex;

public class ReflexTest {

	public static void main(String[] args) {
		String mClassPath = "sz.com.cn.reflex.User";

		try {
			Class clazz = Class.forName(mClassPath);
			// 一个类被加载以后,jvm会创建一个对应该类的Class对象,类的整个结构信息就放到了Class对象里面
			// Class对象就像一面镜子,通过这面镜子可以看到类的所有信息
			
			
			System.out.println(clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
