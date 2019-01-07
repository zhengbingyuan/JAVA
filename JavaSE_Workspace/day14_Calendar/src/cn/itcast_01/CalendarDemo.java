package cn.itcast_01;

import java.util.Calendar;

/*
 * Calendar类：Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法
 * 
 * public int get(int field)返回给定日历字段的值。
 * public void add(int field,int amount);对当前日历字段进行加操作
 * public final void set(int year ,int month,int date)：设置当前的年月日
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//其日历字段已由当前日期和时间初始化： 
	     Calendar rightNow = Calendar.getInstance();
	     
	     //获取年
	     int year = rightNow.get(Calendar.YEAR);
	     int month = rightNow.get(Calendar.MONDAY);
	     int date = rightNow.get(Calendar.DATE);
	     System.out.println(year+"年"+(month+1)+"月"+date+"日");
	     
	     rightNow.add(Calendar.YEAR,5);
	     year = rightNow.get(Calendar.YEAR);
	     month = rightNow.get(Calendar.MONDAY);
	     date = rightNow.get(Calendar.DATE);
	     System.out.println(year+"年"+(month+1)+"月"+date+"日");
	     
	     rightNow.set(2015, 11, 11);
	     year = rightNow.get(Calendar.YEAR);
	     month = rightNow.get(Calendar.MONDAY);
	     date = rightNow.get(Calendar.DATE);
	     System.out.println(year+"年"+(month+1)+"月"+date+"日");
	}
}
