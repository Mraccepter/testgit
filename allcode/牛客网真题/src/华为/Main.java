package »ªÎª;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		int N = Integer.parseInt(ss.split(" ")[0]);
		int M = Integer.parseInt(ss.split(" ")[1]);
		
		int[] nums = new int[N];
		String s = sc.nextLine();
		for(int i = 0; i < N; i++){
			nums[i] = Integer.parseInt(s.split(" ")[i]);
		}
		while(sc.hasNextLine() && M-- > 0){
			String tem = sc.nextLine();
			String first = tem.split(" ")[0];
			if(first.equals("Q")){
				int A = Integer.parseInt(tem.split(" ")[1]);
				int B = Integer.parseInt(tem.split(" ")[2]);
				int max = nums[A-1];
				for(int i = A-1; i <= B-1; i++){
					if(nums[i] > max)
						max = nums[i];
				}
				System.out.println(max);
			}else if(first.equals("U")){
				int A = Integer.parseInt(tem.split(" ")[1]);
				int B = Integer.parseInt(tem.split(" ")[2]);
				nums[A-1] = B;
			}
		}
	}
	

}
