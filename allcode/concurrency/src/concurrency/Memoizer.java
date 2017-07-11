package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;

public class Memoizer implements Computable<A, V>{

	private final ConcurrentMap<A, Future<V>> cache;
	
	private final Computable<A, V> c ;
	
	public Memoizer(Computable<A,V> c) {
		this.cache = c ;
		
	}
	public V compute(final A arg) throws InterruptedException
	{
		while(true)
		{
			Future<V> f = cache.get(arg);
			
			if(null == f)
			{
				Callable<V> eval = new Callable<V>(){
					
				}
			}
		}
		Collections
		Vector
		ConcurrentMap
	}
}
