package sz.com.cn.design.proxy.dymicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import sz.com.cn.design.proxy.staticproxy.Singer;

public class DynamicProxy implements InvocationHandler {

	// �����������Ҫ�������ʵ����
	private Singer subject;

	// ���췽����������Ҫ�������ʵ���󸳳�ֵ
	public DynamicProxy(Singer subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		// �ڴ�����ʵ����ǰ���ǿ������һЩ�Լ��Ĳ���
//		System.out.println("arg0:" + arg0.toString());
//		System.out.println("Method:" + method);
//		System.out.println("arg2:" + arg2);
		// ��������������ʵ����ķ���ʱ������Զ�����ת��������������handler�����invoke���������е���
		method.invoke(subject, arg2);
		// �ڴ�����ʵ���������Ҳ�������һЩ�Լ��Ĳ���
		return null;
	}

}
