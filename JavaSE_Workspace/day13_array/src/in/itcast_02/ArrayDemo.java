package in.itcast_02;
/*
 * ѡ������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13};
		System.out.print("����ǰ");
		printArray(arr);
		
		selectSort(arr);
		System.out.print("�����");
		printArray(arr);
	}
	
	//ѡ������
	public static void selectSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++)
			for(int x = i+1;x<arr.length;x++){
				if(arr[x]<arr[i]){
					int temp = arr[i];
					arr[i]=arr[x];
					arr[x] = temp;
				}
			}
	}
	//��������
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
