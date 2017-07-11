import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Temp {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		String s = null;
		int[][] tt = new int[n][2];
		int j = 0;
		int dupCount = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++){
			s = sc.nextLine();
			if(map.containsKey(Integer.parseInt(s.split(" ")[0]))){
				tt[j][0] = Integer.parseInt(s.split(" ")[0]);
				tt[j++][1] = Integer.parseInt(s.split(" ")[1]);
			}else{
				map.put(Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1]));
			}
		}
		int[] nums = new int[map.values().size()];
		int k = 0;
		for(int i : map.values()){
			nums[k] = i;
		}
		int max = -1;
		int count = 0;
		for(int i = 0; i < nums.length-1; i++){
			for(j = i +1; j < nums.length; j++){
				if(nums[j] > nums[i])
					count++;
			}
			max = Math.max(count, max);
		}
		list.add(max);
		int p = 0;
		while(j-->1){
			map.put(tt[p][0], tt[p++][1]);
			int[] num = new int[map.values().size()];
			int kk = 0;
			for(int i : map.values()){
				num[kk] = i;
			}
			int maxx = -1;
			int countt = 0;
			for(int i = 0; i < num.length-1; i++){
				for(j = i +1; j < num.length; j++){
					if(num[j] > num[i])
						countt++;
				}
				maxx = Math.max(countt, maxx);
			}
			list.add(maxx);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(0));
	}
	
	
}
