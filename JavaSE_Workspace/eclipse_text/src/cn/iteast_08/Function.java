package cn.iteast_08;
import java.util.Scanner;
public class Function {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		System.out.println("两个数中的最大值："+getMax(a,b));
		System.out.println("两个数的和"+sum(a,b));
		System.out.println("两个数是否相等:"+compare(a,b));
		picture(a,b);
	}
	public static int sum(int a,int b){
		int c;
		c=a+b;
		return c;
	}
	public static int getMax(int a , int b){
		/*if(a>b) return a;
		else return b;*/
		return a>b?a:b;
	}
	public static boolean compare(int a, int b){
		/*if (a==b) return true;
		else return false;*/
		return a==b;
	}
	public static void picture(int a ,int b){
		for(int x=0;x<a;x++){
			for(int i = 0;i < b;i++){
				System.out.print('*');
			}
			System.out.println();
		}	
	}
}
