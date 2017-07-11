package concurrency;

public class TimeRunr {
	public static void timeRun(final Runnable r , long timeout, TimeUnit unit) throws InterruptedException
	{
		class RethrowableTask implements Runnable
		{
			private volatile Throwable t ;
			
			public void run()
			{
				try{
					r.run();
				}catch(Throwable t)
				{
					this.t = t;
				}
		
			}
			void rethrow()
			{
				if(t != null)
				{
					throw launderThrowable(t);
				}
			}
		}
		RethrowableTask task = new RethrowableTask();
		
		final Thread taskThread = new Thread(task);
		
		taskThread.start();
		cancelExec.schedule(new Runnable()){
			public void run()
			{
				taskThread.interrupt();   
			}
		}
	}
	ExecutorService
}
