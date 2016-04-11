package sz.com.cn.design.proxy.dymicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import sz.com.cn.design.proxy.staticproxy.Singer;

public class DynamicProxy implements InvocationHandler {

	// 这个就是我们要代理的真实对象
	private Singer subject;

	// 构造方法，给我们要代理的真实对象赋初值
	public DynamicProxy(Singer subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		// 在代理真实对象前我们可以添加一些自己的操作
//		System.out.println("arg0:" + arg0.toString());
//		System.out.println("Method:" + method);
//		System.out.println("arg2:" + arg2);
		// 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		method.invoke(subject, arg2);
		// 在代理真实对象后我们也可以添加一些自己的操作
		return null;
	}

}
