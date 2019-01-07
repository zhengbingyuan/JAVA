package cn.itcast_05;
/*
 * String的转换功能
 * 	byte[] getBytes();把字符串转为字节数组
 * 	char[] toCharArray();把字符串转为字符数组
 * 	static String valueof(char[] chs);把字符数组转成字符串
 * 	static String valueof(int i);把int类型的数据转成字符串
 * 	String toLowerCase();把字符串转成小写
 * 	String toUpperCase();把字符串转成大写
 * 	String concat(String str);把字符串拼接
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "JavaSE";
		
		byte[] bys = s.getBytes();
		for(int x = 0;x<bys.length;x++){
			System.out.println(bys[x]);
		}
		System.out.println("-----------");
		
		char[] ch = s.toCharArray();
		for(int x = 0;x<ch.length;x++){
			System.out.println(ch[x]);
		}
		System.out.println("---------------");
		
		String ss = String.valueOf(ch);
		System.out.println(ss);
		System.out.println("----------------");
		
		System.out.println("toLowerCase:"+s.toLowerCase());
		System.out.println("toLowerCase:"+s);
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1+s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
	}
}
