package cn.itcast_03;

import java.util.Arrays;

/*
 * �������ַ�����"91 27 46 38 50"
 * �����ʵ��������������"27 38 46 50 91"
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
		//ת��Ϊ�ַ���
		String result = sb.toString().trim();
		System.out.println("result:"+result);
	}
}
