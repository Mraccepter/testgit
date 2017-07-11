package temp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class IterateMap {
	abstract int p();
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		//第一种方式
		for(Integer in : map.keySet()){
			System.out.println(map.get(in));
		}
		//第二种方式：通过Map.entrySet使用iterator遍历key和value
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, Integer> entry = it.next();
			int key = entry.getKey();
			int value = entry.getValue();
		}
		//第三种方式：
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int key  = entry.getKey();
			int value = entry.getValue();
		}
		Hashtable;
		AtomicInteger;
		Semaphore
		//第四种方式，只是遍历value值
		for(int value : map.getValues()){
			
		}
	}
	
}
