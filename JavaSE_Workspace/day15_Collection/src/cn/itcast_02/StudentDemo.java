package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 联系：用集合存储5个学生对象，并对学生对象进行遍历
 */
public class StudentDemo {
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
		
		Object[] objs = c.toArray();
		for(int x=0;x<objs.length;x++){
			//System.out.println(objs[x]);
			Student s = (Student)objs[x];
			System.out.println(s.getName()+"--------"+s.getAge());
		}
	}
}
