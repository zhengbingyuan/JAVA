package cn.itcast_01;

import java.util.Scanner;

/*
 * У԰qq����
 * 	1��Ҫ�����5-15λ֮��
 * 	2:0���ܿ�ͷ
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������qq���룺");
		String qq = sc.nextLine();
		System.out.println("cheakQQ(qq):"+cheakQQ(qq));
	}
	public static boolean cheakQQ(String qq){
		boolean flag = true;
		if(qq.length()>=5&&qq.length()<=15){
			if(!qq.startsWith("0")){
				char[] chs = qq.toCharArray();
				for(int x=0;x<chs.length;x++){
					if(!Character.isDigit(chs[x])){
						flag = false;
						break;
						
					}
				}
			}else {
				flag = false;
			}
		}else {
			flag = false;
		}
		
		return flag;
	}
}
