package cn.itcast_02;
/*
 * public String toString():���ظö�����ַ�����ʾ��
 * 			����ֵ���ڣ� getClass().getName() + '@' + Integer.toHexString(hashCode())
 * һ��Ҫ��дtoString�������Զ����ɡ�
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------");
		System.out.println(s.toString());
	}
}
