package LRUÀ„∑®;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<>(16,0.75f,true);
		map.put("a", "a");
		 map.put("b", "b"); //a  a b  
		    map.put("c", "c"); //a  a b c  
		    map.put("a", "a"); //   b c a       
		    map.put("d", "d"); //b  b c a d  
		    map.put("a", "a"); //   b c d a  
		    map.put("b", "b"); //   c d a b       
		    map.put("f", "f"); //c  c d a b f  
		    map.put("g", "g"); //c  c d a b f g  
		    
		    Iterator iterator = map.entrySet().iterator();
		    while(iterator.hasNext()){
		    	Entry<String,String> e = (Entry)iterator.next();
		    	System.out.println(e.getKey() + ":" + e.getValue());
		    }
		
	}
}
