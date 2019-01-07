package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储字符串并遍历
 * 分析：
 * 		A：创建集合对象
 * 		B:创建字符串对象
 * 		C:把字符串对象添加到集合中
 * 		D:遍历集合
 */
public class Collectiontext {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建字符串对象
		//把字符串添加到集合中
		c.add("郑冰原");
		c.add("张翥");
		c.add("张翔");
		
		//遍历集合
		for(Iterator it = c.iterator();it.hasNext();){
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}
}
