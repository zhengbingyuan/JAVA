package cn.itcast_03;
/*
 * �жϹ���
 * 	boolean equals(object obj);�Ƚ��ַ����������Ƿ���ȣ����ִ�Сд
 * 	boolean equalsIgnoreCase(String str);�Ƚ��ַ����Ƿ���ȣ������ִ�Сд
 * 	boolean contains(String str);�жϴ��ַ������Ƿ����С�ַ���
 * 	boolean startsWith(String str);�ж��ַ����Ƿ���ĳ��ָ���ַ�����ͷ
 *  boolean endWith(String str);�ж��ַ����Ƿ���ĳ��ָ���ַ�������
 *  boolean isEmpty();�ж��ַ����Ƿ�Ϊ��
 *  
 */
public class StringDemo {
	public static void main(String[] args) {
		//�����ַ�������
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
