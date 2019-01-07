package cn.iteast_10;

public class Arrayfunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 19;
		arr[2] = 15;
		arr[3] = 13;
		arr[4] = 16;
		System.out.println("printArray:");
		printArray(arr);
		
		System.out.println("getMax:");
		int max=getMax(arr);
		System.out.println(max);
		
		System.out.println("getMin:");
		int min=getMin(arr);
		System.out.println(min);
		
		System.out.println("reverse:");
		reverse(arr);
		printArray(arr);
		
		System.out.println("getIndex:");
		int index=getIndex(arr ,19);
		System.out.println(index);

	}
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int x = 0;x < arr.length; x++){
			if(max < arr[x])
				max = arr[x];
		}
		return max;
	}
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int x = 0;x < arr.length; x++){
			if(min > arr[x])
				min = arr[x];
		}
		return min;
	}
	public static void reverse(int[] arr){
		for(int x = 0;x < arr.length/2;x++){
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	public static void reverse1(int[] arr){
		for(int start = 0,end = arr.length-1;start <= end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	public static int getIndex(int[] arr,int value){
		for(int x = 0;x < arr.length;x++){
			if(arr[x]==value)
				return x;
		}
		return -1;
	}
}
