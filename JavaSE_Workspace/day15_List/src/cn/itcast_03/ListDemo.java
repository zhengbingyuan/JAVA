package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����й���
 * 	A:��ӹ���
 * 		void add(int index,obiext element);��ָ��λ�����Ԫ��
 * 	B����ȡ����
 * 		object get(int index):��ȡָ��λ�õ�Ԫ��
 * 	C���б������
 * 		ListIterator listIteraator():List�������еĵ�����
 * 	D��ɾ������
 * 		object remove(int index):��������ɾ��Ԫ�أ����ر���ɾ����Ԫ��
 * 	E:�޸Ĺ���
 * 		object set(int index ,object element):���������޸�Ԫ�أ����ر��޸ĵ�Ԫ��
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		//�������϶���
		List list = new ArrayList();
		
		//���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//void add(int index,obiext element);��ָ��λ�����Ԫ��
		list.add(1, "android");
		list.add(3, "javaee");
		
		//object get(int index):��ȡָ��λ�õ�Ԫ��
		System.out.println("get:"+list.get(2));
		
		//object remove(int index):��������ɾ��Ԫ�أ����ر���ɾ����Ԫ��
		System.out.println("remove:"+list.remove(2));
		
		//object set(int index ,object element):���������޸�Ԫ�أ����ر��޸ĵ�Ԫ��
		System.out.println("set:"+list.set(2,"world"));
		
		
		System.out.println("list:"+list);
	}
}
