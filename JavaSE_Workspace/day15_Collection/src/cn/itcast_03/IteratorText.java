package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 * ��ϰ ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ��������б���
 */
public class IteratorText {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("����",30);
		Student s2 = new Student("����",31);
		Student s3 = new Student("����",32);
		Student s4 = new Student("�ų�",33);
		Student s5 = new Student("�ѿ�",34);
		//��ѧ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//����
		Iterator it = c.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Student s = (Student) it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
