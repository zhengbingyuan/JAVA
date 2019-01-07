package cn.itcast_02;

import java.util.Scanner;

/*
 *  正则表达式：
 *  	判断功能：
 *  		String类的public boolean matches(String redex)
 *  
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的手机号：");
		String phone = sc.nextLine();
		//定义手机号码规则
		String regex = "1[38]\\d{9}";
		//调用功能，判断即可
		boolean flag = phone.matches(regex);
		System.out.println("falg:"+flag);
	}
}
