package cn.itcast_04;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//yyyy-MM-dd HH:mm:ss
		String s= DateUtil.dataToString(d, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		
		String str = "2014-10-14";
		Date dd = DateUtil.stringToDate(str, "yyyy-MM-dd");
		System.out.println(dd);
	}
}
