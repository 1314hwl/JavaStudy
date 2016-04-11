package sz.com.cn.design.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sz.com.cn.design.proxy.dymicproxy.DynamicProxy;

/*
 * 代理使用场景是:当多个客户来访问实体,但访问的过程是相同的(本例中的,order,draftCcontrct,signContract,sing,payMoney),这时可以用到代理,用代理来处理相同步骤,减少对实体的访问。
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
