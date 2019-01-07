package cn.itcast_01;

import java.util.Calendar;

/*
 * Calendar�ࣺCalendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� �����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ����
 * 
 * public int get(int field)���ظ��������ֶε�ֵ��
 * public void add(int field,int amount);�Ե�ǰ�����ֶν��мӲ���
 * public final void set(int year ,int month,int date)�����õ�ǰ��������
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//�������ֶ����ɵ�ǰ���ں�ʱ���ʼ���� 
	     Calendar rightNow = Calendar.getInstance();
	     
	     //��ȡ��
	     int year = rightNow.get(Calendar.YEAR);
	     int month = rightNow.get(Calendar.MONDAY);
	     int date = rightNow.get(Calendar.DATE);
	     System.out.println(year+"��"+(month+1)+"��"+date+"��");
	     
	     rightNow.add(Calendar.YEAR,5);
	     year = rightNow.get(Calendar.YEAR);
	     month = rightNow.get(Calendar.MONDAY);
	     date = rightNow.get(Calendar.DATE);
	     System.out.println(year+"��"+(month+1)+"��"+date+"��");
	     
	     rightNow.set(2015, 11, 11);
	     year = rightNow.get(Calendar.YEAR);
	     month = rightNow.get(Calendar.MONDAY);
	     date = rightNow.get(Calendar.DATE);
	     System.out.println(year+"��"+(month+1)+"��"+date+"��");
	}
}
