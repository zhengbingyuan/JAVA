package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 存储自定义对象并遍历，用普通for循环。（size()和get()结合）
 * 
 */
public class ListDemo3 {
	public static void main(String[] args) {
		//创建集合
		List list = new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("郑冰原",23);
		Student s2 = new Student("张翥",24);
		Student s3 = new Student("张翔",22);
		
		//把学生添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//遍历
		//迭代器遍历
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"----------"+s.getAge());
		}
		System.out.println("-----------");
		
		//普通for循环
		for(int x = 0;x<list.size();x++){
			Student s= (Student)list.get(x);
			System.out.println(s.getName()+"----------"+s.getAge());
		}
				
	}
}
