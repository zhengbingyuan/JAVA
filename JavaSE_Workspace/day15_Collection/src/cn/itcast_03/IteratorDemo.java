package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator();�����������ϵ�ר�ñ�����ʽ
 * 		Object next();��ȡԪ�أ����ƶ�����һ��
 * 		Boolean hasNext();
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator iterator();���ϵ�ר�ñ�����ʽ
		Iterator it = c.iterator();
		//Object next();��ȡԪ�أ����ƶ�����һ��
		//Object obj = it.next();
		//System.out.println(obj);
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
