package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�ַ���������
 * ������
 * 		A���������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class Collectiontext {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//�����ַ�������
		//���ַ�����ӵ�������
		c.add("֣��ԭ");
		c.add("����");
		c.add("����");
		
		//��������
		for(Iterator it = c.iterator();it.hasNext();){
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}
}
