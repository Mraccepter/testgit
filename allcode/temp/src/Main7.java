import java.util.ArrayList;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.hashCode());
 		List l = find(list);
		System.out.println(list == l);
	}
	public static List<Integer> find(List list){
		list = new ArrayList<Integer>();
		System.out.println(list.hashCode());
		return list;
	}
}