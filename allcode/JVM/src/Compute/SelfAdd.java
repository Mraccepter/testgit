package Compute;
//这道题的结果为什么是0，应该是跟jvm的处理有关系



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
