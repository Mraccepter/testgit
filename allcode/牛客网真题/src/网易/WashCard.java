package Эјвз;

import java.util.Arrays;
import java.util.Scanner;

public class WashCard {
	public static int[] washcard(int[] card, int washCount){
		int[] a = card;
		int len = a.length;
		int[] up = new int[len/2];
		int[] down = new int[len/2];
		while(washCount-- != 0){
			for(int i =1 ;i <= len /2; i++){
				up[i-1] = a[i-1];
				down[i-1] = a[i-1+len/2];
			}
			int i = 0;
			for(int j = 1; j <= len; j = j + 2){
				a[j-1] = up[i];
				a[j] = down[i];
				i++;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] card = {1,2,3,4,5,6};
//		int[] newCard = washcard(card,2);
//		System.out.println(Arrays.toString(newCard));
	}
}
