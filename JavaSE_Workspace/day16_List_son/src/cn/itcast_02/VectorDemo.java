package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector的特殊功能
 * 1：添加功能
 * public void addElement(object obj)
 * @：获取功能
 * public object elementAt(int index)
 * public Enumeration elements()
 */
public class VectorDemo {
	public static void main(String[] args) {
		//创建集合对象
		Vector v = new Vector();
		
		//添加功能
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		
		//遍历
		for(int x = 0;x<v.size();x++){
			String s = (String)v.elementAt(x);
			System.out.println(s);
		}
		System.out.println("-----------");
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			String s = (String)en.nextElement();
			System.out.println(s);
		}
		
	}
}
