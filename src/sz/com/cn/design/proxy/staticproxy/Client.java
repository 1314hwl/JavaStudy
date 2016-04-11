package sz.com.cn.design.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sz.com.cn.design.proxy.dymicproxy.DynamicProxy;

/*
 * ����ʹ�ó�����:������ͻ�������ʵ��,�����ʵĹ�������ͬ��(�����е�,order,draftCcontrct,signContract,sing,payMoney),��ʱ�����õ�����,�ô�����������ͬ����,���ٶ�ʵ��ķ��ʡ�
 */
public class Client {
	public static void main(String[] args) {
		// ProxySinger proxy = new ProxySinger(new Singer());
		// proxy.order();
		// proxy.draftContract();
		// proxy.signContract();
		// proxy.sing();
		// proxy.payMoney();

		Singer realSinger = new Singer();
		DynamicProxy handler = new DynamicProxy(realSinger);
		SignedSinger singerProxy = (SignedSinger) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				new Class[] { SignedSinger.class }, handler);
		singerProxy.sing();

	}

}
