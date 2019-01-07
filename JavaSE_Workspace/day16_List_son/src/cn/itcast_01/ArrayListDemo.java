package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * list��������ص㣺
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ�
 * 		LinkedList:
 * 			�ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 
 * ������
 * 		ʹ��List���κ�����洢�ַ�����洢�Զ�����󲢱�����
 * 
 * ArrayList��ʹ��
 * 		�洢�ַ���������
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
		Iterator<String> it = array.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		for(int x=0;x<array.size();x++){
			String s= (String)array.get(x);
			System.out.println(s);
		}
	}
}
