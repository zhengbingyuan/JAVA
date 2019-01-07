package cn.iteast_11;

public class Array2 {
		public static void main(String[] args){
			int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
			int[][] arr2={{1,2,3},{4,5},{6}};
		/*	for(int x=0;x<arr[0].length;x++){
				System.out.println(arr[0][x]);
			}
			for(int x=0;x<arr[1].length;x++){
				System.out.println(arr[1][x]);
			}*/
			for(int x=0;x<arr.length;x++){
				for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+" ");
				}
			System.out.println();
			}
			System.out.println("------------");
			
			printArray2(arr2);
		}
		public static void printArray2(int[][] arr){
			for(int x=0;x<arr.length;x++){
				for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+" ");
				}
			System.out.println();
			}
		}
}
