package cn.itcast_03;
/*
 * �ָ����ϰ
 * 
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s1 = "aa,bb,cc";
		String regex = ",";
		String[] strArray = s1.split(regex);
		for(int x=0;x<strArray.length;x++){
			System.out.println(strArray[x]);
		}
		System.out.println("-----------");
		
		String s2 = "aa.bb.cc";	
		String[] str2Array = s2.split("\\.");
		for(int x=0;x<str2Array.length;x++){
			System.out.println(str2Array[x]);
		}
		System.out.println("-----------");
		
		String s3 = "aa    bb               cc";	
		String[] str3Array = s3.split(" +");
		for(int x=0;x<str3Array.length;x++){
			System.out.println(str3Array[x]);
		}
		System.out.println("-----------");
		
		//Ӳ���ϵ�·��������Ӧ��\\���\
		String s4 = "E:\\JavaSE\\day14\\avi";	
		String[] str4Array = s4.split("\\\\");
		for(int x=0;x<str4Array.length;x++){
			System.out.println(str4Array[x]);
		}
		System.out.println("-----------");
		
	}
}
