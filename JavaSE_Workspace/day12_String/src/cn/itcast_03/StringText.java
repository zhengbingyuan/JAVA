package cn.itcast_03;

import java.util.Scanner;

/*
 * ģ���½�������λ���
 * 
 */
public class StringText {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for(int x=0;x<3;x++){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String pwd = sc.nextLine();
		
		if(username.equals(name)&&password.equals(pwd)){
			System.out.println("��¼�ɹ���");
		}else {
			if ((2-x)==0){
				System.out.println("�˻��Ѷ��ᣡ");
			}else
			System.out.println("��¼ʧ�ܣ��㻹��"+(2-x)+"�λ���");
		}
		
		}
		
	}
}
