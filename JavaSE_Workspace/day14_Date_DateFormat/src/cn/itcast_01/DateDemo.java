package cn.itcast_01;

import java.util.Date;

/*
 * Date��
 * ���췽����
 * 		Date();���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 * 		Date(long date);���ݸ����ĺ���ֵ�������ڶ���
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("d:"+d);
		
		//long time = System.currentTimeMillis();
		long time = 1000*60*60;
		Date d2 = new Date(time);
		System.out.println("d2:"+d2);
	}
}
