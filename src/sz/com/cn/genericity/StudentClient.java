package sz.com.cn.genericity;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

//1.���͸���:<>��������
//2.��������:��ȫʡ��
//3.�Զ��巺��
//1>������:��<��ĸT,E,K,V...>:ֻ�����ڳ�Ա������,ֻ��ʹ����������
//2>���ͽӿ�:�ӿ�<��ĸT,E,K,V...>:ֻ�����ڳ��󷽷���
//3>���ͷ���:<��ĸK,E,T,V...>:<T>void

public class StudentClient {
	public static void main(String[] args) {
		MyStudent<Integer> s = new MyStudent<Integer>();
		s.setT(90);
		System.out.println("" + s.getT());
		test("���ͷ�������...");
	}

	/*
	 * ���ͷ���:��voidǰ���<T>
	 */
	public static <T> void test(T t) {
		System.out.println(t);
	}

	public static <T extends List> void test1(T t) {
		t.add("");
		t.add(234);
		t.add(true);
	}

	public static <T extends List<String>> void test2(T t) {
		t.add("");// ������Tָ����ϸ����:List<String>����
		// t.add(234);
		// t.add(true);
	}

	public static <T extends List<String>> T test3(T t) {
		t.add("abc");
		t.add("efg");
		return t;
	}

	public static <T extends Closeable> void test4(T... closees) {
		for (T t : closees) {
			if (t != null) {
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
