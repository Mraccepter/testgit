package HashMapTest;

import java.util.HashMap;
/*
 * 1 new PhoneNumber(027, 33333333)���������������Σ�������HashMap��wangwu��abcͬʱ������
   2 ʹ��get����ȡ�õ�ֵ��Ϊnull
   ������Ҫ��дPerson���hashcode������equals����
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
