import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[][] nums = new int[N][4];
		//定义R为-3，G为-2，B为-1
		for(int i = 0; i < N; i++){
			String tem = sc.nextLine();
			String[] ss = tem.split(" ");
			switch(ss[0]){
			case "G" : nums[i][0] = -2;
						nums[i][1] = Integer.parseInt(ss[1]);
						nums[i][2] = Integer.parseInt(ss[2]);
						nums[i][3] = Integer.parseInt(ss[3]);
						continue;
			case "B" : nums[i][0] = -1;
						nums[i][1] = Integer.parseInt(ss[1]);
						nums[i][2] = Integer.parseInt(ss[2]);
						nums[i][3] = Integer.parseInt(ss[3]);
						continue;
			case "R" : nums[i][0] = -3;
						nums[i][1] = Integer.parseInt(ss[1]);
						nums[i][2] = Integer.parseInt(ss[2]);
						nums[i][3] = Integer.parseInt(ss[3]);	
						continue;
			}
		}
		double max = -1.0;
		for(int i = 0; i < N - 2; i++){
			for(int j = i+1; j < N-1; j++){
				for(int k = j+1; k <N; k++){
					if((nums[i][0] == nums[j][0] && nums[j][0] == nums[k][0]) ||
							(nums[i][0] != nums[j][0] && nums[j][0] != nums[k][0] && nums[i][0] != nums[k][0])){
						double x1=nums[i][1],x2 = nums[j][1],x3 = nums[k][1],y1 = nums[i][2],y2 = nums[j][2],y3=nums[k][2];
						double z1 = nums[i][3],z2 = nums[j][3],z3 = nums[k][3];
						double s1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
						double s2=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)+(z1-z3)*(z1-z3));
						double s3=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3)+(z3-z2)*(z3-z2));
						double p=(s1+s2+s3)/2;
						double a=Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
						max = Math.max(a, max);
					}
				}
		}
	}

		System.out.println(String.format("%.5f", max));
		}
}
