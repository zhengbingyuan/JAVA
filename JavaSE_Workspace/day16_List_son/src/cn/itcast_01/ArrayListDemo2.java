package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		Student s1 = new Student("Ö£±ùÔ­",23);
		Student s2 = new Student("ÕÅôã",22);
		Student s3 = new Student("ÕÅÏè",21);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		Iterator it = array.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}
		
		System.out.println("----------");
		
		for(int x=0;x<array.size();x++){
			Student s = (Student)array.get(x);
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
