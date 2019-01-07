package cn.itcast_05;
/*
 * StringBuffer的反转功能：
 * public StringBuffer reverse();反转功能
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("郑冰原天才");
		System.out.println("sb:"+sb);
		sb.reverse();
		System.out.println("sb:"+sb);
	}
}
