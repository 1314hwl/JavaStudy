package sz.com.cn.reflex;

public class ReflexTest {

	public static void main(String[] args) {
		String mClassPath = "sz.com.cn.reflex.User";

		try {
			Class clazz = Class.forName(mClassPath);
			// һ���౻�����Ժ�,jvm�ᴴ��һ����Ӧ�����Class����,��������ṹ��Ϣ�ͷŵ���Class��������
			// Class�������һ�澵��,ͨ�����澵�ӿ��Կ������������Ϣ
			
			
			System.out.println(clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
