package in.itcast_02;
/*
 * 基本格式：
 * 		public boolean hasNextInt();判断是否是某种类型的元素
 * 		public int nextInt();获取还元素
 * 常用的两个方法
 * 		public int nextInt();获取一个int类型的值
 * 		public String nextLine();获取一个String类型的值
 * 
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			System.out.println("请输入一个数据：");
			int x = sc.nextInt();
			System.out.println("x:"+x);
		} else {
			System.out.println("你输入的数据有误");
		}	
		
		//先获取一个int值，在获取一个字符串
		//会出现问题；s1没有数据，用不同的对象接收
		int a = sc.nextInt();
		String s1 = sc.nextLine();
		System.out.println("a:"+a+"  s1:"+s1);
		
	}
}
