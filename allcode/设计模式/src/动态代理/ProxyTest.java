package ¶¯Ì¬´úÀí;

public class ProxyTest {

	public static void main(String[] args) {
		Subject2 sub = new RealSubject();
		
		ProxyHandler invocationHandler = new ProxyHandler(sub);
		
		Subject2 proxy = (Subject2)invocationHandler.getProxy();
		
		proxy.doSomething2();
		
		
	}
}
