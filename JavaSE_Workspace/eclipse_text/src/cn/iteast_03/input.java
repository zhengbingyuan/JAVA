package cn.iteast_03;
import java.util.Scanner;
public class input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int a=sc.nextInt();
		System.out.println("������һ������");
		int b=sc.nextInt();
		System.out.println("������һ������");
		int c=sc.nextInt();
		int temp=(a>b?a:b);
		int max=(temp>c?temp:c);
		System.out.println("max:"+max);
	}

}
