package cn.itcast_01;
/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * ������
 * 		public static void gc();��������������
 * 		public static void exit(int status);
 * 		public static long currentTimeMillis();
 * 		public static void arraycopy(object src,int srcPos,object dest,int destPot,int length);
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("֣��ԭ",23);
		System.out.println(p);
		p = null;
		System.gc();
	}
}
