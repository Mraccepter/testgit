package sevenchapter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class TrackingExecutor extends AbstractExecutorService{

	private final ExecutorService exec;
	private final Set<Runnable> tasksCancelledAtShutdown = Collections.synchronizedSet(new HashSet<Runnable>());
	
	
	public void execute(final Runnable runnable)
	{
		exec.execute(new Runnable(){
			public void run()
			{
				try{
					runnable.run();
				}finally{
					if(isShutdown() && Thread.currentThread().isInterrupted())
					{
						tasksCancelledAtShutdown.add(runnable);
					}
				}
			}
		});
	}
	public void run()
	{
		Throwable thrown = null;
		try{
			while(!isInterrupted())
			{
				runTask(getTaskFromWorkQueue());
			}
		}catch(Throwable e)
		{
			thrown = e;
		}finally{
			threadExited(this,thrown);
		}
	}
}
