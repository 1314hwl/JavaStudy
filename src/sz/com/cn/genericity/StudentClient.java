package sz.com.cn.genericity;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

//1.泛型概念:<>泛化类型
//2.泛型作用:安全省心
//3.自定义泛型
//1>泛型类:类<字母T,E,K,V...>:只能用在成员变量上,只能使用引用类型
//2>泛型接口:接口<字母T,E,K,V...>:只能用在抽象方法上
//3>泛型方法:<字母K,E,T,V...>:<T>void

public class StudentClient {
	public static void main(String[] args) {
		MyStudent<Integer> s = new MyStudent<Integer>();
		s.setT(90);
		System.out.println("" + s.getT());
		test("泛型方法调用...");
	}

	/*
	 * 泛型方法:在void前面加<T>
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
		t.add("");// 给泛型T指定详细类型:List<String>类型
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
