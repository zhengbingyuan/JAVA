package cn.itcast_02;

import java.util.Scanner;

/*
 * Ч������
 * 
 */
public class RegexText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String email = sc.nextLine();
		
		//�����������
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		boolean flag = email.matches(regex);
		System.out.println("flag:"+flag);
	}
}
