package cn.itcast_01;

import java.util.Scanner;

/*
 * ������ʽ������һ��������ַ���
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������qq���룺");
		String qq = sc.nextLine();
		System.out.println("cheakQQ(qq):"+cheakQQ(qq));
	}
	public static boolean cheakQQ(String qq){
		String regex = "[1-9][0-9]{4,14}";
		boolean flag = qq.matches(regex);
		return flag;
	}
}
