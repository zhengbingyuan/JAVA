package in.itcast_01;
/*
 * 数组的冒泡排序：
 */
public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] arr = {24,69,80,57,13};
		System.out.print("排序前");
		printArray(arr);
		
		//
		/*for(int i = 0;i<arr.length-1;i++)
			for(int x = 0;x<arr.length-1-i;x++){
				if(arr[x]>arr[x+1]){
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}*/
		bubbleSort(arr);
		System.out.print("排序后：");
		printArray(arr);
	}
	//冒泡排序功能
	public static void bubbleSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++)
			for(int x = 0;x<arr.length-1-i;x++){
				if(arr[x]>arr[x+1]){
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		
	}
	//遍历功能
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x = 0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.print(arr[x]+"]");
			}else{
				System.out.print(arr[x]+", ");
			}
		}
	}
}
