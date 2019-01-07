package cn.itcast_03;

import java.util.Scanner;

/*
 * 分割功能
 * 		String类的public String[] split(String regex) 
 * 		根据给定正则表达式的匹配拆分此字符串
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		//定义一个年龄搜索范围
		String ages = "18-24";
		
		//定义规则
		String regex  = "-";
		//调用方法
		String[] strArray = ages.split(regex);
		//遍历
		for(int x=0;x<strArray.length;x++){
			System.out.println(strArray[x]);
		}
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		
		if(age>=startAge&&age<=endAge){
			System.out.println("可以！");
		}else {
			System.out.println("不可以！");
		}
	}
}
