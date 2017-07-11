package temp;

import java.util.HashSet;
import java.util.Set;

public class ThreeStooges {
	private final Set<String> stooges = new HashSet();
	public ThreeStooges(){
		stooges.add("a");
		stooges.add("b");
	}
	
	public void add(String s){
		stooges.add("d");
	}
	
}
