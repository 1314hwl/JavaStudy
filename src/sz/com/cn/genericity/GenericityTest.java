package sz.com.cn.genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericityTest {
	public static void main(String[] args) {
		// <>就是泛型,标签,泛化类型
		// 作用省心安全
		List<String> data = new ArrayList<>();
		data.add("test");
		// data.add(1);//直接提示不能加integer

		// jdk1.4以及以前是没有泛型的
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
		// 没有泛型-麻烦
	}

}
