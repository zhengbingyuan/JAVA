package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * �洢�Զ�����󲢱���������ͨforѭ������size()��get()��ϣ�
 * 
 */
public class ListDemo3 {
	public static void main(String[] args) {
		//��������
		List list = new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("֣��ԭ",23);
		Student s2 = new Student("����",24);
		Student s3 = new Student("����",22);
		
		//��ѧ����ӵ�������
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//����
		//����������
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"----------"+s.getAge());
		}
		System.out.println("-----------");
		
		//��ͨforѭ��
		for(int x = 0;x<list.size();x++){
			Student s= (Student)list.get(x);
			System.out.println(s.getName()+"----------"+s.getAge());
		}
				
	}
}
