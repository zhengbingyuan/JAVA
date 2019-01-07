package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的遍历，其实就是依次获取集合中的每一个元素
 * object[] toArray()
 *  	把集合转成数组，可以实现集合的遍历
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//单个添加
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//把集合转换成数组
		Object[] objs = c.toArray();
		for(int x=0;x<objs.length;x++){
			//System.out.println(objs[x]);
			String s = (String) objs[x];
			System.out.println(s+"-------"+s.length());
		}
		
	}
}
