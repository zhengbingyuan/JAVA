package cn.itcast_03;

import java.util.Arrays;

/*
 * 我们有字符串："91 27 46 38 50"
 * 请代码实现最终输出结果："27 38 46 50 91"
 */
public class RegexText {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		String regex = " ";
		String[] strArray = s.split(regex);
		int[] arr = new int[strArray.length];
		for(int x=0;x<arr.length;x++){
			arr[x]=Integer.parseInt(strArray[x]);
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<arr.length;x++){
			sb.append(arr[x]).append(" ");
		}
		//转换为字符串
		String result = sb.toString().trim();
		System.out.println("result:"+result);
	}
}
