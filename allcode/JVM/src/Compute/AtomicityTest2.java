package Compute;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//使用原子类来实现
public class AtomicityTest2 implements Runnable {

	private AtomicInteger i = new AtomicInteger(0);
	
	public int getValue()
	{
		return i.get();
	}
	public void evenIncrement()
	{
		i.addAndGet(2);
	}
	public void run()
	{
		while(true)
		{
			evenIncrement();
		}
	}
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask(){
			public void run()
			{
				System.err.println("aborting");
				System.exit(0);
			}
		}, 5000);
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest2 at = new AtomicityTest2();
		exec.execute(at);
		while(true)
		{
			int val = at.getValue();
			if(val % 2 != 0)
			{
				System.out.println(val);
				System.exit(0);
			}
					
		}
	}
}
