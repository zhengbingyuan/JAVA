package in.itcast_01;
/*
 * Scanner：用于接收键盘输入数据
 * 
 */
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
	//创建对象
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一行数据：");
		String s1 = s.nextLine();
		System.out.println("s1: "+s1);
}
}
