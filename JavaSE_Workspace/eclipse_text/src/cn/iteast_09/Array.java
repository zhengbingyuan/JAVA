package cn.iteast_09;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("----------");
		arr[0]=10;
		arr[1]=100;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		int[] arr1 = arr;
		arr1[0]=66;
		System.out.println("----------");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("----------");
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("---------");
		System.out.println(arr.length);
		System.out.println(arr1.length);
	}

}
