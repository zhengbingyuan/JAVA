package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：去除集合中的自定义对象的重复值
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("郑冰原",23);
		Student s2 = new Student("张翥",23);
		Student s3 = new Student("张翔",23);
		Student s4 = new Student("郑冰原",22);
		Student s5 = new Student("郑冰原",21);
		Student s6 = new Student("张翥",23);
		Student s7 = new Student("张翥",23);
		Student s8 = new Student("张翥",22);
		Student s9 = new Student("张翔",23);
		
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
		
		//遍历旧集合
		Iterator it = array.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			if(!newArray.contains(s)){
				newArray.add(s);
				
			}
		}
		
		//遍历新集合
		for(int x= 0;x<newArray.size();x++){
			Student s = (Student)newArray.get(x);
			System.out.println(s.getName()+"----------"+s.getAge());
		}
	}
}
