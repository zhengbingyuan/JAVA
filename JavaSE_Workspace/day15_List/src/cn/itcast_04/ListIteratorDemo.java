package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/*
 * 列表迭代器：
 * 		ListIterator listIterator():List集合特有的迭代器
 * 
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		//创建List集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s= (String)lit.next();
			System.out.println(s);
		}
	}
}
