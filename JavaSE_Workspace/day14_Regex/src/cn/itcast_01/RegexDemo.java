package cn.itcast_01;

import java.util.Scanner;

/*
 * 校园qq号码
 * 	1：要求必须5-15位之间
 * 	2:0不能开头
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的qq号码：");
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
