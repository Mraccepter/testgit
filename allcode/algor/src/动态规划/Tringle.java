package 动态规划;
//9.1
public class Tringle {
	int n;
	int[][] a;
	//方法1，递归计算
	int solve(int i, int j){
		return a[i][j] + (i == n? 0 :Math.max(solve(i+1,j),solve(i+1,j+1)));
	}
}
