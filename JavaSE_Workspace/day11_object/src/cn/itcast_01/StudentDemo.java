package cn.itcast_01;
/*
 * �� Object
 * 		�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
 * 
 * 		public final Class  getClass():���ش� Object ������ʱ�ࡣ
 * 
 * 		Class��ķ���
 * 			public String getName()���� String ����ʽ���ش� Class ��������ʾ��ʵ�壨�ࡢ�ӿڡ������ࡢ�������ͻ� void�����ơ� 
 */

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		Student s3 = s1;
		System.out.println(s3.hashCode());
		System.out.println("-------------");
		
		Student s = new Student();
		Class c = s.getClass();
		String str = c.getName();
		System.out.println(str);
		
		//��ʽ���
		String str2 = s.getClass().getName();
		System.out.println(str2);
	}
}
