package cn.itcast_03;

import java.util.Scanner;

/*
 * 模拟登陆，给三次机会
 * 
 */
public class StringText {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for(int x=0;x<3;x++){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String pwd = sc.nextLine();
		
		if(username.equals(name)&&password.equals(pwd)){
			System.out.println("登录成功！");
		}else {
			if ((2-x)==0){
				System.out.println("账户已冻结！");
			}else
			System.out.println("登录失败！你还有"+(2-x)+"次机会");
		}
		
		}
		
	}
}
