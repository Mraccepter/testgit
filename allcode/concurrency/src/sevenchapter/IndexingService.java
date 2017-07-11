package sevenchapter;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

public class IndexingService {

	private static final File POISON = new File("");
	private final IndexerThread consumer = new IndexerThread();
	private final CrawlerThread producer = new CrawlerThread();
	private final BlockingQueue<File> queue;
	private final FileFilter fileFilter;
	private final File root;
	
	class CrawlerThread extends Thread{
		public void run()
		{
			try{
				crawl(root);
			}catch(InterruptedException e)
			{
				System.out.println("发生异常");
			}finally{
				while(true)
				{
					try{
						queue.put(POISON);
						break;
					}catch(InterruptedException e)
					{
						System.out.println("重新尝试");
					}
				}
			}
		}
		private void crawl(File root) throws InterruptedException
		{
			
		}
	}
	class IndexerThread extends Thread{
		public void run()
		{
			try{
				while(true)
				{
					File file = queue.take();
					if(file == POISON){
						break;
					}else{
						indexFile(file);
					}
				}
			}catch(InterruptedException e)
			{
				
			}
		}
	}
	public void start(){
		producer.start();
		consumer.start();
	}
	public void stop()
	{
		producer.interrupt();
	}
	public void awaitTermination() throws InterruptedException{
		consumer.join();
	}
}
