package cn.itcast_01;
/*
 * 构造方法
 * 		public String();空构造
 * 		public String(byte[] bytes);把字节数据转成字符串
 * 		public String(byte[] bytes , int offset , int length);//将字节数组的一部分转成字符串
 * 		public String(char[] value);把字符数组转成字符串
 * 		public String(char[] value , int offset , int length);
 * 		public String(String origanal);把字符串常量转成字符串
 * 字符串的方法：
 * 		public int length();换回字符串的长度
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println(s1.length());
		System.out.println("-----------------");
		
		byte[] bys = {97,98,99,100,101};
		String s2 = new String(bys);
		System.out.println("s2:"+s2);
		System.out.println(s2.length());
		System.out.println("-----------------");
		
		String s3 = new String(bys,1,3);
		System.out.println("s3:"+s3);
		System.out.println(s3.length());
		System.out.println("-----------------");
		
		char[] chs = {'a','b','c','d','e'};
		String s4 = new String(chs);
		System.out.println("s4:"+s4);
		System.out.println(s4.length());
		System.out.println("--------------");
		
		String s6 = new String("abcde");
		System.out.println("s6:"+s6);
		System.out.println(s6.length());
		System.out.println("--------");
	}
}
