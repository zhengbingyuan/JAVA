package cn.itcast_03;

import java.util.Arrays;

/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * ������
 * 		public static void gc();��������������
 * 		public static void exit(int status);��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ
 * 		public static long currentTimeMillis();�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * 		public static void arraycopy(object src,int srcPos,object dest,int destPot,int length);
 * 			 ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý���
 */
public class SystemDemo {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		int[] arr2 = {6,7,8,9,10};
		System.arraycopy(arr,1,arr2,2,2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
}
