package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Student s1 = new Student("张翥",23);
		Student s2 = new Student("张翔",23);
		Student s3 = new Student("张城",23);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"------"+s.getAge());
		}
		
	}
}
