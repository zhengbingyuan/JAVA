package in.itcast_04;
/*
 * 
 * 二分查找（折半查找）
 * 		前提：数组有序
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		int index = getIndex(arr,31);
		System.out.println("index:"+index);
	}
	public static int getIndex(int[] arr,int value){
		int max =arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		
		while(arr[mid]!=value){
			if(arr[mid]>value){
				max = mid -1;
			}else if(arr[mid]<value){
				min = mid+1;
			}
			
			if(min>max){
				return -1;
			}
			mid=(max+min)/2;
		}
		return mid;
	}
}
