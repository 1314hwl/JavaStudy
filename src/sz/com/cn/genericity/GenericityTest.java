package sz.com.cn.genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericityTest {
	public static void main(String[] args) {
		// <>���Ƿ���,��ǩ,��������
		// ����ʡ�İ�ȫ
		List<String> data = new ArrayList<>();
		data.add("test");
		// data.add(1);//ֱ����ʾ���ܼ�integer

		// jdk1.4�Լ���ǰ��û�з��͵�
		List data1 = new ArrayList();
		data1.add("123");
		data1.add(1);
		for (int i = 0; i < data1.size(); i++) {
			if (data1.get(i) instanceof Integer) {
				System.out.println("" + data1.get(i));
			} else if (data1.get(i) instanceof String) {
				System.out.println(data1.get(i));
			}
		}
		// û�з���-�鷳
	}

}
