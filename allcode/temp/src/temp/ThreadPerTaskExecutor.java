package temp;

import java.util.concurrent.Executor;

public class ThreadPerTaskExecutor implements Executor {
	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		new Thread(command).start();
	}
	//��ͬ����ʽִ�����е�Executor
//	public void execute(Runnable r){
//		r.run();
//	}
	
}
