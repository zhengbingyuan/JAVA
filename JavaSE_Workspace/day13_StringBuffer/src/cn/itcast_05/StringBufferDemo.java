package cn.itcast_05;
/*
 * StringBuffer�ķ�ת���ܣ�
 * public StringBuffer reverse();��ת����
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("֣��ԭ���");
		System.out.println("sb:"+sb);
		sb.reverse();
		System.out.println("sb:"+sb);
	}
}
