package HashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args){
		HashMap<Person, String> map = new HashMap<Person,String>();
		Person p1 = new Person(11, "zhangsan");
		Person p2 = new Person(12, "lisi");
		
		map.put(p1, "zhangsan");
		map.put(p2, "lisi");
		
		System.out.println("zhangsan: " + map.get(p1));
		System.out.println("lisi: " + map.get(p2));
		
//		HashMap<Character, Integer> m = new HashMap<>();
//		if(m.get('a') == 5)
//			System.out.println(5);
//		else
//			System.out.println(0);
	}
}
