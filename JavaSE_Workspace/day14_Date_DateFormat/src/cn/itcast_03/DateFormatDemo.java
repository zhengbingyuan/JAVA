package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date----String(格式化)
 * 
 * String----Date（解析）
 * DateFormat:可以进行日期和字符的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat();默认模式
 * 		SimpleDateFormat(String pattern);给定模式
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//创建格式化对象
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//给定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		//String-----Date
		String str = "2008-08-08 12:12:12";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
