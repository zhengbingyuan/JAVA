package cn.itcast_05;
/*
 * String��ת������
 * 	byte[] getBytes();���ַ���תΪ�ֽ�����
 * 	char[] toCharArray();���ַ���תΪ�ַ�����
 * 	static String valueof(char[] chs);���ַ�����ת���ַ���
 * 	static String valueof(int i);��int���͵�����ת���ַ���
 * 	String toLowerCase();���ַ���ת��Сд
 * 	String toUpperCase();���ַ���ת�ɴ�д
 * 	String concat(String str);���ַ���ƴ��
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
