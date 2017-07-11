package ¶¯Ì¬´úÀí;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyHandler implements InvocationHandler{

	private Object proxied;
	
	public ProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("before");
		Object obj = method.invoke(proxied, args);
		System.out.println("after");
		return obj;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), proxied.getClass().getInterfaces(), this);
	}
}
