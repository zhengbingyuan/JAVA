package cn.itcast_02;

import java.util.Date;

/*
 * Date类
 * 构造方法：
 * 		Date();根据当前的默认毫秒值创建日期对象
 * 		Date(long date);根据给定的毫秒值创建日期对象
 * 方法：
 * public long getTime();获取时间，以毫秒为单位
 * public void setTime(long time);设置时间
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		//获取时间
		long time = d.getTime();
		System.out.println("time:"+time);
		System.out.println(System.currentTimeMillis());
		System.out.println("d:"+d);
		//设置时间
		d.setTime(1000);
		System.out.println("d:"+d);
		
	}
}
