package cn.iteast_05;
import java.util.Scanner;
public class Inputstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String s = sc.nextLine();
		switch (s){
		case "hello":
			System.out.println("���������hello");
			break;
		case "world":
			System.out.println("���������world");
			break;
		case "java":
			System.out.println("���������java");
			break;
		default:
			System.out.println("û�������������");
		}
	}

}
