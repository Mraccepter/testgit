package HashMapTest;

import java.util.HashMap;
/*
 * 1 new PhoneNumber(027, 33333333)这个键被添加了两次，但是在HashMap中wangwu和abc同时存在了
   2 使用get方法取得的值均为null
   所以需要重写Person类的hashcode方法和equals方法
 */
public class Temp {

	public static void main(String[] args){
		
		HashMap<Person, String> map = new HashMap<Person,String>();
	
		
		map.put(new Person(11, "zhangsan"), "zhangsan");
		map.put(new Person(11, "zhangsan"), "abc");
		map.put(new Person(12, "lisi"), "lisi");
		
		System.out.println(map.toString());
		
		System.out.println(map.get(new Person(12, "lisi")));
		System.out.println(map.get(new Person(11, "zhangsan")));
		
	}
}
