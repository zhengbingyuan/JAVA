package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ��
 * object[] toArray()
 *  	�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//�������
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//�Ѽ���ת��������
		Object[] objs = c.toArray();
		for(int x=0;x<objs.length;x++){
			//System.out.println(objs[x]);
			String s = (String) objs[x];
			System.out.println(s+"-------"+s.length());
		}
		
	}
}
