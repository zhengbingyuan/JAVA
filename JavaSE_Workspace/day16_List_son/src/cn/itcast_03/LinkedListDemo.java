package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList�����⹦��
 * 	A:��ӹ���
 * 		public void addFirst(object obj)
 * 		public void addLast(Object obj)
 * 	B:��ȡ����
 * 		public Object getFirst()
 * 		public Object getLast()
 * 	C:ɾ������
 * 		public Object removeFirst()
 * 		public Object removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedList link = new LinkedList();
		
		//���Ԫ��
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
		
		//���������
		System.out.println("link"+"---"+link);
	}
}
