package cn.itcast_02;

import java.util.Date;

/*
 * Date��
 * ���췽����
 * 		Date();���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 * 		Date(long date);���ݸ����ĺ���ֵ�������ڶ���
 * ������
 * public long getTime();��ȡʱ�䣬�Ժ���Ϊ��λ
 * public void setTime(long time);����ʱ��
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		//��ȡʱ��
		long time = d.getTime();
		System.out.println("time:"+time);
		System.out.println(System.currentTimeMillis());
		System.out.println("d:"+d);
		//����ʱ��
		d.setTime(1000);
		System.out.println("d:"+d);
		
	}
}
