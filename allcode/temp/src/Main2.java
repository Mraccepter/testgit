import java.util.TreeMap;

public class Main2 {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(2,2);
		map.put(3, 3);
		map.put(1, 1);
		map.put(5, 5);
		map.put(4, 4);
		for(int i : map.values())
			System.out.print(i + " ");
	}
}