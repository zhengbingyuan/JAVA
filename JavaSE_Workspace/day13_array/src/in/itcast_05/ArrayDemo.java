package in.itcast_05;

import java.util.Arrays;

/*
 * Arrays������
 * public static String toString(int[] a)������ת���ַ���
 * public static void sort(int[] a)�������������
 * public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr  = {24,69,80,57,13};
		System.out.println("����ǰ��"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("�����"+Arrays.toString(arr));
		
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:"+Arrays.binarySearch(arr,577));
	}
}
