package cn.iteast_05;
import java.util.Scanner;
public class Inputstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String s = sc.nextLine();
		switch (s){
		case "hello":
			System.out.println("你输入的是hello");
			break;
		case "world":
			System.out.println("你输入的是world");
			break;
		case "java":
			System.out.println("你输入的是java");
			break;
		default:
			System.out.println("没有你输入的数据");
		}
	}

}
