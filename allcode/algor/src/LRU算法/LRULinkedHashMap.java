package LRUÀ„∑®;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V>{
	
	private static final int LRU_MAX_CAPACITY = 1024;
	private int capacity;
	
	public LRULinkedHashMap() {
		super();
	}
	public LRULinkedHashMap(int initialCapacity, float loadFactor, boolean isLRU) {  
        super(initialCapacity, loadFactor, true);  
        capacity = LRU_MAX_CAPACITY;  
    } 
	public LRULinkedHashMap(int initialCapacity, float loadFactor, boolean isLRU, int lruCapacity) {  
        super(initialCapacity, loadFactor, true);  
        this.capacity = lruCapacity;  
    } 
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
		System.out.println(eldest.getKey() + "=" + eldest.getValue());  
        
        if(size() > capacity) {  
            return true;  
        }  
        return false; 
	}
	
	public static void main(String[] args) {  
		  
	    LinkedHashMap<String, String> map = new LRULinkedHashMap<String, String>(16, 0.75f, true);  
	    map.put("a", "a"); //a  a  
	    map.put("b", "b"); //a  a b  
	    map.put("c", "c"); //a  a b c  
	    map.put("a", "a"); //   b c a       
	    map.put("d", "d"); //b  b c a d  
	    map.put("a", "a"); //   b c d a  
	    map.put("b", "b"); //   c d a b       
	    map.put("f", "f"); //c  c d a b f  
	    map.put("g", "g"); //c  c d a b f g  
	  
	    map.get("d"); //c a b f g d  
	    for (Entry<String, String> entry : map.entrySet()) {  
	        System.out.print(entry.getValue() + ", ");  
	    }  
	    System.out.println();  
	  
	    map.get("a"); //c b f g d a  
	    for (Entry<String, String> entry : map.entrySet()) {  
	        System.out.print(entry.getValue() + ", ");  
	    }  
	    System.out.println();  
	  
	    map.get("c"); //b f g d a c  
	    for (Entry<String, String> entry : map.entrySet()) {  
	        System.out.print(entry.getValue() + ", ");  
	    }  
	    System.out.println();  
	  
	    map.get("b"); //f g d a c b  
	    for (Entry<String, String> entry : map.entrySet()) {  
	        System.out.print(entry.getValue() + ", ");  
	    }  
	    System.out.println();  
	  
	    map.put("h", "h"); //f  f g d a c b h  
	    for (Entry<String, String> entry : map.entrySet()) {  
	        System.out.print(entry.getValue() + ", ");  
	    }  
	    System.out.println();  
	}  

}
