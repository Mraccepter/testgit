package xiti;
//������3����9����������
public class E3_10 {

	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int len1 = c1.length;
		int len2 = c2.length;
		int j = 0;
		//flagΪ��־λ
		int flag = 0;
		for(int i = 0; i < len2; i++){
			//ע�������jѭ�����÷��������j����ÿ�ζ���0��ʼ��
			for(; j < len1; j++){
				if(c1[j] == c2[i]){
					flag = 1;
					break;
				}
			}
			if(flag == 1){
				flag = 0;
				continue;
			}
			else{
				System.out.println("not ok");
				return;
			}
	}
		System.out.println("ok");
	}
}
