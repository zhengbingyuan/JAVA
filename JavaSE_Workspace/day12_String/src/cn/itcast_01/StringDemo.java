package cn.itcast_01;
/*
 * ���췽��
 * 		public String();�չ���
 * 		public String(byte[] bytes);���ֽ�����ת���ַ���
 * 		public String(byte[] bytes , int offset , int length);//���ֽ������һ����ת���ַ���
 * 		public String(char[] value);���ַ�����ת���ַ���
 * 		public String(char[] value , int offset , int length);
 * 		public String(String origanal);���ַ�������ת���ַ���
 * �ַ����ķ�����
 * 		public int length();�����ַ����ĳ���
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
