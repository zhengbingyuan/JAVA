package cn.itcast_03;
/*
 * 判断功能
 * 	boolean equals(object obj);比较字符串的内容是否相等，区分大小写
 * 	boolean equalsIgnoreCase(String str);比较字符串是否相等，不区分大小写
 * 	boolean contains(String str);判断大字符串中是否包含小字符串
 * 	boolean startsWith(String str);判断字符串是否以某个指定字符串开头
 *  boolean endWith(String str);判断字符串是否以某个指定字符串结束
 *  boolean isEmpty();判断字符串是否为空
 *  
 */
public class StringDemo {
	public static void main(String[] args) {
		//创建字符串对象
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("---------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("---------------");
		
		
		System.out.println(s1.contains("he"));
		//System.out.println(s1.contains(s));
		System.out.println("------------------");
		
		System.out.println(s1.startsWith("h"));
		System.out.println("------------------");
		
		System.out.println(s1.isEmpty());
		String s4 = "";
		//String s5 = null;
		System.out.println(s4.isEmpty());
		
	}
}
