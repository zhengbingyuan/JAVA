package cn.itcast_02;

import java.util.Scanner;

/*
 * 效验邮箱
 * 
 */
public class RegexText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();
		
		//定义邮箱规则
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		boolean flag = email.matches(regex);
		System.out.println("flag:"+flag);
	}
}
