package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/*
 * �б��������
 * 		ListIterator listIterator():List�������еĵ�����
 * 
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		//����List���϶���
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
