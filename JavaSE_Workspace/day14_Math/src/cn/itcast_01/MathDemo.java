package cn.itcast_01;

import java.util.Scanner;

/*
 * 需求：设计一个方法，可以实现获取任意范围内的随机数
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始的数：");
		int start = sc.nextInt();
		System.out.println("请输入结束的数：");
		int end = sc.nextInt();
		
		for(int x=0;x<100;x++){
			int num = getRandom(start,end);
			System.out.println(num);
		}
	}
	
	/*
	 * 写一个功能
	 * 返回值类型：int
	 * 参数列表：int start ，int end
	 */
	public static int getRandom(int start,int end){
		int number = (int)(Math.random()*(end-start+1))+start;
		return number;
	}
}
