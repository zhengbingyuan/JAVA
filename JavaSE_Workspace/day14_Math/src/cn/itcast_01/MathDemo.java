package cn.itcast_01;

import java.util.Scanner;

/*
 * �������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ������
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ������");
		int start = sc.nextInt();
		System.out.println("���������������");
		int end = sc.nextInt();
		
		for(int x=0;x<100;x++){
			int num = getRandom(start,end);
			System.out.println(num);
		}
	}
	
	/*
	 * дһ������
	 * ����ֵ���ͣ�int
	 * �����б�int start ��int end
	 */
	public static int getRandom(int start,int end){
		int number = (int)(Math.random()*(end-start+1))+start;
		return number;
	}
}
