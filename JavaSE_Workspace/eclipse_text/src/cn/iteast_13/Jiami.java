package cn.iteast_13;
import java.util.Scanner;
public class Jiami {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int number=sc.nextInt();
		int[] arr = new int[8];
		
		int index = 0;
		while(number>0){
			arr[index]=number%10;
			index++;
			number/=10;
		}
		for(int x = 0;x<index;x++){
			arr[x]+=5;
			arr[x]%=10;
		}
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		for(int x = 0;x<index;x++){
			System.out.print(arr[x]);
		}
		System.out.println();
	}

}
