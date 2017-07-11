package oo;
//java中涉及byte、short、char类型的算术运算首先会吧这些值转换为int类型，需要进行强制转换
public class Temp {
// + 或者 * 都会将输出结果转为int类型，所以需要强制转换
// +=运算符不会产生类型转换，如short s = 1；s = s + 1;编译错误  s += 1;正确	
	public static void main(String[] args) {
		byte a1 = 2,a2 = 4,a3;
		short s = 16;
		s += 1;
		a3 = (byte)(a1 + a2);
	}
}
