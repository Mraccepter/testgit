package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用future等待图像下载
public class FutureRenderer {

	private final ExecutorService executor = Executors.newCachedThreadPool();
	
	void renderPage(CharSequence source)
	{
		final List<ImageInfo> imageInfos = scanForImageInfo(source);
		
		Callable<List<ImageData>> task = new Callable<List<ImageData>>(){
			public List<ImageData> call()
			{
				List<ImageData> result = new ArrayList<ImageData>();
				
				for(ImageInfo imageInfo :imageInfos)
					result.add(imageInfo.downloadImage());
				return result;
			}
		};
		Future<List<ImageData>> future = executor.submit(task);
		
		renderText(source);
		
		try{
			List<ImageData> imageData = future.get();
			
			for(ImageData data : imageData)
			{
				renderImage(data);
			}
			catch(InterruptedException e)
			{
				Thread.currentThread().interrupt();
				future.cancel(true);
			}catch(ExecutionException e)
			{
				throw launderThrowable(e.getCause());
			}
		}
	}
}
