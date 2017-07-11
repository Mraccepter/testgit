package 二叉树;
/*
 * 输入一个整数数组，判断是否是二叉搜索树的后序遍历结果。
 * */
public class IsBinPostSearch {

	public boolean judge(int[] a, int l, int r){
		if(l >= r) return true;
		int i = r;
		while(i > l && a[i -1] > a[r]) --i;
		for(int j = i -1; j >= l;--j)
			if(a[j] > a[r]) 
				return false;
		return judge(a, l, i-1) && (judge(a,i,r-1));
	}
	public boolean VerifySquenceOfBST(int [] sequence) {
        int n = sequence.length;
        if(sequence == null ||n == 0)
        	return false;
        return judge(sequence, 0, sequence.length -1);
    }
	/*-------------------------------------------------------*/
	//另一种方法
	public boolean verify2(int[] a){
		int size = a.length;
		if(0 == size)
			return false;
		int i = 0;
		while(--size != 0){
			while(a[i++] < a[size]);
			while(a[i++] > a[size]);
		
			if(i < size) return false;
			i = 0;
		}
		return true;
	}
}
