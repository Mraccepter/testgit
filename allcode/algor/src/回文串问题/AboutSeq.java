package ���Ĵ�����;

import java.util.Scanner;

/*
 * ���һ��������������֮���ԭ������һ���ľͳ���������������Ϊ�������С����磺
{1, 2, 1}, {15, 78, 78, 15} , {112} �ǻ�������, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} ���ǻ������С�
���ڸ���һ���������У�����ʹ��һ��ת��������
ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�
 * */
public class AboutSeq {

	public static void main(String[] args){    
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int times = 0;
            int n = scanner.nextInt();
            int[] inputArr = new int[n];
            for(int i = 0; i < n; i++){
                inputArr[i] = scanner.nextInt();
            }
            int head = 0;
            int tail = n - 1;
            while(head < tail){
                if(inputArr[head] > inputArr[tail]){
                    inputArr[--tail] += inputArr[tail + 1];
                    times++;
                }else if(inputArr[head] < inputArr[tail]){
                    inputArr[++head] += inputArr[head - 1];
                    times++;
                }else{
                    head++;
                    tail--;
                }
            }      
            System.out.println(times);
        }
        scanner.close();
    }
}
