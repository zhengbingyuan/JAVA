package cn.itcast_02;

import java.util.Scanner;

/*
 *  ������ʽ��
 *  	�жϹ��ܣ�
 *  		String���public boolean matches(String redex)
 *  
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ��ţ�");
		String phone = sc.nextLine();
		//�����ֻ��������
		String regex = "1[38]\\d{9}";
		//���ù��ܣ��жϼ���
		boolean flag = phone.matches(regex);
		System.out.println("falg:"+flag);
	}
}
