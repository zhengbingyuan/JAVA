package cn.itcast_07;
/*
 * String和 StringBuffer的互相转换
 * 
 */
public class StringBufferText {
	public static void main(String[] args) {
		String s = "hello";
		//利用构造方法可以把String转为StringBuffer
		StringBuffer sb = new StringBuffer(s);
		//或着
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:"+sb);
		System.out.println("sb2:"+sb2);
		
		StringBuffer buffer = new StringBuffer("java");
		//通过构造转
		String str =new String(buffer);
		//通过toString（）方法转
		String str2 =buffer.toString();
		System.out.println("str:"+str);
		System.out.println("str2:"+str2);
	}
}
