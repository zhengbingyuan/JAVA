package cn.iteast_12;
import java.util.Scanner;
public class Array2yanghui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int n=sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int x=0;x<arr.length;x++){
			arr[x][0]=1;
			arr[x][x]=1;
		}
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
			}
		}
		
		printArray2(arr);
	}
	public static void printArray2(int[][] arr){
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
			System.out.print(arr[x][y]+"  ");
			}
		System.out.println();
		}
	}
}
