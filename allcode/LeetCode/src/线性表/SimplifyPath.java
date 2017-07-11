package ���Ա�;

import java.util.Stack;
/*
 * ����һ����·�����⣬·���򻯵������ǣ�

��������/../"����Ҫ�����ϼ�Ŀ¼�������ϼ�Ŀ¼�Ƿ�Ϊ�ա�

������"/./"���ʾ�Ǳ���Ŀ¼���������κ����������

������"//"���ʾ�Ǳ���Ŀ¼���������κβ�����

�����������ַ����ʾ���ļ�����������򻯡�

���ַ����ǿջ���������/../��������Ҫ����һ��"/"��
 * */
public class SimplifyPath {

	public static String simplifyPath(String path){
		Stack<String> ss = new Stack<>();
		for(int i =0; i < path.length();){
			while(i < path.length() && '/' == path.charAt(i))
				i++;
			String s ="";
			while(i < path.length() && path.charAt(i) != '/')
				s += path.charAt(i++);
			if(s.equals("..") && !ss.isEmpty())
				ss.pop();
			else if(!s.equals("") && !s.equals(".") && !s.equals(".."))
				ss.push(s);
		}
		if(ss.isEmpty()){
			return "/";
		}
		String s = "";
		while(!ss.isEmpty()){
			s = "/" + ss.peek() + s;
			ss.pop();
		}
		return s;
	}
	public static void main(String[] args) {
		String[] s = {"/home/","/a/./b/../../c/"};
		System.out.println(simplifyPath(s[0]));
		System.out.println(simplifyPath(s[1]));
	}
}
