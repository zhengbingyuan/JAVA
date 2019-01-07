package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator();迭代器，集合的专用遍历方式
 * 		Object next();获取元素，并移动到下一个
 * 		Boolean hasNext();
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator iterator();集合的专用遍历方式
		Iterator it = c.iterator();
		//Object next();获取元素，并移动到下一个
		//Object obj = it.next();
		//System.out.println(obj);
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
