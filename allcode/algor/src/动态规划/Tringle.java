package ��̬�滮;
//9.1
public class Tringle {
	int n;
	int[][] a;
	//����1���ݹ����
	int solve(int i, int j){
		return a[i][j] + (i == n? 0 :Math.max(solve(i+1,j),solve(i+1,j+1)));
	}
}
