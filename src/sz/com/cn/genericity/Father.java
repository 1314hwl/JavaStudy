package sz.com.cn.genericity;

//泛型父类
//1.类保留父类泛型,泛型子类Son1
//2.类不保留父类泛型,子类按需实现
//3.子类覆盖父类方法随父类而定
//4.子类使用父类的属性随父类而定
//5.子类自定义的方法随自己而定
public abstract class Father<T1, T2> {
	T1 age;

	abstract void test(T2 name);
}
// 保留
// 1.全部保留

class Son1<T2, T1, A, B> extends Father<T1, T2> {

	@Override
	void test(T2 name) {
		// TODO Auto-generated method stub

	}

}

// 2.部分保留

class Son2<T2, A, B> extends Father<Integer, T2> {

	@Override
	void test(T2 name) {
		// TODO Auto-generated method stub

	}

}

// 1.具体类型
// 不保留:
class Son3 extends Father<String, Integer> {

	@Override
	void test(Integer name) {
		// TODO Auto-generated method stub

	}

}

// 2.没有类型-泛型擦除
class Son4 extends Father {

	@Override
	void test(Object name) {
		// TODO Auto-generated method stub

	}

}
