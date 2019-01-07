package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的遍历
 * 		size()和get()方法结合使用
 *  
 */
public class ListDemo2 {
	public static void main(String[] args) {
		//创建集合
		List list = new ArrayList();
		
		//添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//遍历集合
		for(int x = 0;x<list.size();x++){
			String s = (String)list.get(x);
			System.out.println(s);
		}
	}
}
