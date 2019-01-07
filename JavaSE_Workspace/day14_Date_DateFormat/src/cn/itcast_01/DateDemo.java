package cn.itcast_01;

import java.util.Date;

/*
 * Date类
 * 构造方法：
 * 		Date();根据当前的默认毫秒值创建日期对象
 * 		Date(long date);根据给定的毫秒值创建日期对象
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
