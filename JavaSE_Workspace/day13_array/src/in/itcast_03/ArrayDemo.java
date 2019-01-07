package in.itcast_03;
/*
 * 把字符串中的字符进行排序
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 */
public class ArrayDemo {
	public static void main(String[] args) {
		
		String s = "dacgebf";
		char[] arr = s.toCharArray();
		
		bubbleSort(arr);
		String result = String.valueOf(arr);
		System.out.println(result);
	}
	//冒泡排序
	public static void bubbleSort(char[] arr){
		for(int i = 0;i<arr.length-1;i++)
			for(int x=0;x<arr.length-1-i;x++){
				if(arr[x]>arr[x+1]){
					char temp =arr[x];
					arr[x]=arr[x+1];
					arr[x+1]=temp;
				}
			}
			
	}
}
