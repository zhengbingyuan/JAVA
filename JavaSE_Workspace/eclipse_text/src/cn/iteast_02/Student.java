package cn.iteast_02;
/*import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int x=sc.nextInt();
		System.out.println("你输入的数据："+x);
	}

}*/
/*import java.util.Scanner;
class Student{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int x=sc.nextInt();
		System.out.println("请输入一个数据：");
		int y=sc.nextInt();
		int sum=(x+y);
		System.out.println("sum:"+sum);
		
	}
}*/
import java.util.Scanner;
class Student {
	public static void main(String[] args){
		//键盘录入对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int a=sc.nextInt();
		System.out.println("请输入一个数据：");
		int b=sc.nextInt();
		int max=(a>b?a:b);
		System.out.println("max:"+max);
	}
}