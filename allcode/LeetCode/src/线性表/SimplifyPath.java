package 线性表;

import java.util.Stack;
/*
 * 这是一道简化路径的题，路径简化的依据是：

当遇到“/../"则需要返回上级目录，需检查上级目录是否为空。

当遇到"/./"则表示是本级目录，无需做任何特殊操作。

当遇到"//"则表示是本级目录，无需做任何操作。

当遇到其他字符则表示是文件夹名，无需简化。

当字符串是空或者遇到”/../”，则需要返回一个"/"。
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
