package temp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class IterateMap {
	abstract int p();
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		//��һ�ַ�ʽ
		for(Integer in : map.keySet()){
			System.out.println(map.get(in));
		}
		//�ڶ��ַ�ʽ��ͨ��Map.entrySetʹ��iterator����key��value
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, Integer> entry = it.next();
			int key = entry.getKey();
			int value = entry.getValue();
		}
		//�����ַ�ʽ��
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int key  = entry.getKey();
			int value = entry.getValue();
		}
		Hashtable;
		AtomicInteger;
		Semaphore
		//�����ַ�ʽ��ֻ�Ǳ���valueֵ
		for(int value : map.getValues()){
			
		}
	}
	
}
