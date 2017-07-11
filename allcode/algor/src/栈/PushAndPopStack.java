package ջ;

import java.util.Stack;

/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * */
public class PushAndPopStack {

	public static boolean isPopOrder(int[] push, int[] pop){
		if(push.length != pop.length || push.length == 0)
			return false;
		Stack<Integer> s = new Stack();
		int len = push.length;
		int j = 0;
		for(int i = 0; i < len; i++){
			s.push(push[i]);
			while(!s.isEmpty() && s.peek() == pop[j]){
				s.pop();
				j++;
			}
		}
		return s.isEmpty();
	}
}
