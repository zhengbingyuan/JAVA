package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ȥ�������е��Զ��������ظ�ֵ
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array = new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("֣��ԭ",23);
		Student s2 = new Student("����",23);
		Student s3 = new Student("����",23);
		Student s4 = new Student("֣��ԭ",22);
		Student s5 = new Student("֣��ԭ",21);
		Student s6 = new Student("����",23);
		Student s7 = new Student("����",23);
		Student s8 = new Student("����",22);
		Student s9 = new Student("����",23);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		array.add(s8);
		array.add(s9);
		
		ArrayList newArray = new ArrayList();
		
		//�����ɼ���
		Iterator it = array.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			if(!newArray.contains(s)){
				newArray.add(s);
				
			}
		}
		
		//�����¼���
		for(int x= 0;x<newArray.size();x++){
			Student s = (Student)newArray.get(x);
			System.out.println(s.getName()+"----------"+s.getAge());
		}
	}
}
