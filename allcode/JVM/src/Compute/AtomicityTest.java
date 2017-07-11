package Compute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//这个不应该是单线程吗，为什么会出现这种情况？？
public class AtomicityTest implements Runnable {

	private int i = 0;
	//如果下面这句代码不加synchronized那么，就会出现问题，出现奇数
	public synchronized int getValue()
	{
		return i;
	}
	private synchronized void evenIncrement()
	{
		i++;
		i++;
	}
	public void run()
	{
		while(true)
		{
			evenIncrement();
		}
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		while(true)
		{
			int val = at.getValue();
			if(val % 2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
