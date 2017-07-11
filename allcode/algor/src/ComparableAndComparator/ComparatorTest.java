package ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

import Å£¿ÍÍøÊÔÌâ.Main;

class newComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		int a = o1.intValue();
		int b = o2.intValue();
		return a > b ? -1 :(a < b ? 1 : 0);
	}
}
public class ComparatorTest {

	public static void main(String[] args) {
		Integer[] i = {1,3,5,2,8,6};
		Arrays.sort(i, new newComparator());
		System.out.println(Arrays.toString(i));
	}
}
