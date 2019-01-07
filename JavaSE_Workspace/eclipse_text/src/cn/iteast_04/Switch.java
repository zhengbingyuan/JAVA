package cn.iteast_04;
import java.util.Scanner;
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("下面的几个人你最喜欢谁？");
		System.out.println("65 郑冰原");
		System.out.println("66 张翥");
		System.out.println("67 张翔");
		System.out.println("68 李长頔");
		
		System.out.println("请输入你的选择：");
		int choicenumber=sc.nextInt();
		
		char choice = (char) choicenumber;
		
		switch(choice){
		case 'A':
			System.out.println("恭喜你，选对了");
			break;
		case 'B':
			System.out.println("不好意识你选择有误");
			break;
		case 'C':
			System.out.println("不好意识你选择有误");
			break;
		case 'D':
			System.out.println("不好意识你选择有误");
			break;
		default:
			System.out.println("没有该选项");
			break;
		}
	}

}
