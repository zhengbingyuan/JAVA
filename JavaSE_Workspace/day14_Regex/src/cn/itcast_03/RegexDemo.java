package cn.itcast_03;

import java.util.Scanner;

/*
 * �ָ��
 * 		String���public String[] split(String regex) 
 * 		���ݸ���������ʽ��ƥ���ִ��ַ���
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		//����һ������������Χ
		String ages = "18-24";
		
		//�������
		String regex  = "-";
		//���÷���
		String[] strArray = ages.split(regex);
		//����
		for(int x=0;x<strArray.length;x++){
			System.out.println(strArray[x]);
		}
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		int age = sc.nextInt();
		
		if(age>=startAge&&age<=endAge){
			System.out.println("���ԣ�");
		}else {
			System.out.println("�����ԣ�");
		}
	}
}
