package cn.itcast_02;
/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * ������
 * 		public static void gc();��������������
 * 		public static void exit(int status);��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ
 * 		public static long currentTimeMillis();�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * 		public static void arraycopy(object src,int srcPos,object dest,int destPot,int length);
 */
public class SystemDemo {
	public static void main(String[] args) {
//		System.out.println("���");
//		System.exit(0);
//		System.out.println("congming");
		System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		for(int x = 0;x<100000;x++){
			System.out.println("hello"+x);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ"+(end-start)+"����");
	}
}
