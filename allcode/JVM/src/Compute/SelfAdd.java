package Compute;
//�����Ľ��Ϊʲô��0��Ӧ���Ǹ�jvm�Ĵ����й�ϵ



public class SelfAdd {
	    public static void main(String[] args) { 
	    	SelfAdd inc = new SelfAdd(); 
	       int i = 0; 
	       inc.fermin(i); 
	       i= i++; 
	       System.out.println(i);
	    
	    } 
	    void fermin(int i){ 
	       i++; 
	    } 
}
