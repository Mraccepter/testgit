package ×Ö·û´®;
//×Ö·û´®×ªÕûÊý
public class StringToNum2 {

	public int strToNum(String s){
		if(s == null || s.length() <= 0)
			throw new NumberFormatException();
		char first = s.charAt(0);
		int positive = 1;
		if(first == '-'){
			positive = -1;
			for(int i = 1; i < s.length(); i++){
				if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
					throw new NumberFormatException();
			}
		}else if(first != '+' && )
	}
}
