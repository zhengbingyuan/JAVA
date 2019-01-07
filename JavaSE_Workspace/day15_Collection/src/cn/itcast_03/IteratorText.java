package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 * 练习 ：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器进行遍历
 */
public class IteratorText {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("留意",30);
		Student s2 = new Student("张翔",31);
		Student s3 = new Student("张翥",32);
		Student s4 = new Student("张诚",33);
		Student s5 = new Student("佳俊",34);
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//遍历
		Iterator it = c.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Student s = (Student) it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
