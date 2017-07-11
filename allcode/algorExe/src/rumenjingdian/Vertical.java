package rumenjingdian;

import java.util.HashSet;
import java.util.Set;

//竖式问题
public class Vertical {
	TreeSet
	private int count;
	private Set s = new HashSet();
	public String ss = new String();
	public boolean IsVertical(int abc, int de){
	int i = abc % 10;
	int j = abc / 10 % 10;
	int k = abc / 100;
	
	int m = de % 10;
	int n = de /10 % 10;
	s.add(i);
	s.add(j);
	s.add(k);
	s.add(m);
	s.add(n);
	
	int x = abc * de;
	int y = abc * m;
	int z = abc * n;
	
	String
	
	
	
	}
	private String[] getChar(int a){
		//如何判断整型参数是否为空？
//		if(0 == a)
//			System.exit(0);;
		String s[] = new String[5];
		int count = 0;
		while(a != 0)
		{
			s[count] = String.valueOf(a % 10);
			a /= 10;
			count++;
		}
		return s;
	}
}
