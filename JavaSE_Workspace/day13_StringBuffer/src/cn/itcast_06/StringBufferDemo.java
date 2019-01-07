package cn.itcast_06;
/*
 * StringBuffer的截取功能
 * public String substring(int start)
 * public String substring(int start,int end)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello").append("world").append("java");
		String s = sb.substring(5);
		System.out.println("s:"+s);
		System.out.println("sb:"+sb);
		
		String ss = sb.substring(5,10);
		System.out.println("ss:"+ss);
		
		String sss = ss.substring(2);
		System.out.println("sss:"+sss);
		System.out.println("ss:"+ss);
		
		System.out.println("sb:"+sb);
	}
}
