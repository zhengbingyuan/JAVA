package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date----String(��ʽ��)
 * 
 * String----Date��������
 * DateFormat:���Խ������ں��ַ��ĸ�ʽ���ͽ��������������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
 * 
 * SimpleDateFormat�Ĺ��췽����
 * 		SimpleDateFormat();Ĭ��ģʽ
 * 		SimpleDateFormat(String pattern);����ģʽ
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//������ʽ������
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		//String-----Date
		String str = "2008-08-08 12:12:12";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
