package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ȥ���������ظ���Ԫ��ֵ
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array = new ArrayList();
		
		//���Ԫ�ص�����
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("hello");
		
		//�����¼���
		ArrayList newArray = new ArrayList();
		
		//�����ɼ���
		Iterator it = array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		
		//�����¼���
		for(int x=0;x<newArray.size();x++){
			String s = (String)newArray.get(x);
			System.out.println(s);
		}
	}
}
