package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList的特殊功能
 * 	A:添加功能
 * 		public void addFirst(object obj)
 * 		public void addLast(Object obj)
 * 	B:获取功能
 * 		public Object getFirst()
 * 		public Object getLast()
 * 	C:删除功能
 * 		public Object removeFirst()
 * 		public Object removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedList link = new LinkedList();
		
		//添加元素
		link.add("hello");
		link.add("world");
		link.add("java");
		
		//public void addFirst(object obj)
		link.addFirst("javaee");
		link.addLast("android");
		
		//public Object getFirst()
		//public Object getLast()
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		
		//public Object removeFirst()
		//public Object removeLast()
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		
		//输出对象名
		System.out.println("link"+"---"+link);
	}
}
