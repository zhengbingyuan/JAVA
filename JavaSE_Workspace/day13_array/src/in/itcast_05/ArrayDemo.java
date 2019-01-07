package in.itcast_05;

import java.util.Arrays;

/*
 * Arrays工具类
 * public static String toString(int[] a)把数组转成字符串
 * public static void sort(int[] a)对数组进行排序
 * public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr  = {24,69,80,57,13};
		System.out.println("排序前："+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
		
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:"+Arrays.binarySearch(arr,577));
	}
}
