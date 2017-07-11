package 华为;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
		String s = sc.nextLine();
		String[] ss = s.split(",");
		for(int i =0; i < ss.length; i++){
			if(!ss[i].matches("[0-9]+")){
				System.out.println(-1);
				return;
			}
		}
		int a = Integer.parseInt(s.split(",")[0]);
		int b = Integer.parseInt(s.split(",")[1]);
		int c = Integer.parseInt(s.split(",")[2]);
		if(a == b || a == c || b == c ){
			System.out.println(-1);
			return;
		}
		if(a < 1 || a >9 || b < 1 || b > 9 || c < 1 || c > 9){
			System.out.println(-1);
			return;
		}
		//范围 1-9 不能同时包含2，5,；3,6
		int[] nums = {a,b,c};
		Arrays.sort(nums);
		int max = nums[2];
		int times = 0;
		for(int i = 0; i < 2; i++){
			if(nums[i] == 2 || nums[i] == 5)
				times++;
		}
		if(times > 1){
			System.out.println(-1);
			return;
		}
		times = 0;
		for(int i = 0; i < 2; i++){
			if(nums[i] == 6 || nums[i] == 9)
				times++;
		}
		if(times > 1){
			System.out.println(-1);
			return;
		}
		if(a == 2 || b == 2 || c== 2){
			if(a == 6 || b == 6 || c== 6){
				int[] newNums = {a,b,c,5,9};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);	
				return;
			}
			if(a == 9 || b == 9 || c== 9){
				int[] newNums = {a,b,c,5,6};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);
				return;
			}
			int[] newNums = {a,b,c,5};
			Arrays.sort(newNums);
			int[] result = new int[9];
			for(int i = 0; i < 4; i++){
				result[i] = newNums[i];
			}
			result[4] = newNums[0] * 10 + newNums[1];
			result[5] = newNums[0] * 10 + newNums[2];
			result[6] = newNums[0] * 10 + newNums[3];
			result[7] = newNums[1] * 10 + newNums[0];
			result[8] = newNums[1] * 10 + newNums[2];
			System.out.println(result[max-1]);
			return;
		}
		if(a == 5 || b == 5 || c== 5){
			if(a == 6 || b == 6 || c== 6){
				int[] newNums = {a,b,c,2,9};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);	
				return;
			}
			if(a == 9 || b == 9 || c== 9){
				int[] newNums = {a,b,c,2,6};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);	
				return;
			}
			int[] newNums = {a,b,c,2};
			Arrays.sort(newNums);
			int[] result = new int[9];
			for(int i = 0; i < 4; i++){
				result[i] = newNums[i];
			}
			result[4] = newNums[0] * 10 + newNums[1];
			result[5] = newNums[0] * 10 + newNums[2];
			result[6] = newNums[0] * 10 + newNums[3];
			result[7] = newNums[1] * 10 + newNums[0];
			result[8] = newNums[1] * 10 + newNums[2];
			System.out.println(result[max-1]);
		}
		if(a == 6 || b == 6 || c== 6){
			if(a == 2 || b == 2 || c== 2){
				int[] newNums = {a,b,c,5,9};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);	
				return;
			}
			if(a == 5 || b == 5 || c== 5){
				int[] newNums = {a,b,c,9,2};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);	
				return;
			}
			int[] newNums = {a,b,c,9};
			Arrays.sort(newNums);
			int[] result = new int[9];
			for(int i = 0; i < 4; i++){
				result[i] = newNums[i];
			}
			result[4] = newNums[0] * 10 + newNums[1];
			result[5] = newNums[0] * 10 + newNums[2];
			result[6] = newNums[0] * 10 + newNums[3];
			result[7] = newNums[1] * 10 + newNums[0];
			result[8] = newNums[1] * 10 + newNums[2];
			System.out.println(result[max-1]);
			return;
		}
		if(a == 9 || b == 9 || c== 9){
			if(a == 2 || b == 2 || c== 2){
				int[] newNums = {a,b,c,5,6};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);
				return;
			}
			if(a == 5 || b == 5 || c== 5){
				int[] newNums = {a,b,c,2,6};
				Arrays.sort(newNums);
				int[] result = new int[9];
				for(int i = 0; i < 5; i++){
					result[i] = newNums[i];
				}
				result[4] = newNums[0] * 10 + newNums[1];
				result[5] = newNums[0] * 10 + newNums[2];
				result[6] = newNums[0] * 10 + newNums[3];
				result[7] = newNums[0] * 10 + newNums[4];
				result[8] = newNums[1] * 10 + newNums[0];
				System.out.println(result[max-1]);
				return;
			}
			int[] newNums = {a,b,c,6};
			Arrays.sort(newNums);
			int[] result = new int[9];
			for(int i = 0; i < 4; i++){
				result[i] = newNums[i];
			}
			result[4] = newNums[0] * 10 + newNums[1];
			result[5] = newNums[0] * 10 + newNums[2];
			result[6] = newNums[0] * 10 + newNums[3];
			result[7] = newNums[1] * 10 + newNums[0];
			result[8] = newNums[1] * 10 + newNums[2];
			System.out.println(result[max-1]);
			return;
		}
		int[] newNums = {a,b,c};
		Arrays.sort(newNums);
		int[] result = new int[9];
		for(int i = 0; i < 3; i++){
			result[i] = newNums[i];
		}
		result[3] = newNums[0] * 10 + newNums[1];
		result[4] = newNums[0] * 10 + newNums[2];
		result[5] = newNums[1] * 10 + newNums[0];
		result[6] = newNums[1] * 10 + newNums[2];
		result[7] = newNums[2] * 10 + newNums[0];
		result[8] = newNums[2] * 10 + newNums[1];
		System.out.println(result[max-1]);
		
	}
	}
}
