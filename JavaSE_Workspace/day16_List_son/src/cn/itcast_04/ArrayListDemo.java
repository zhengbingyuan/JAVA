package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：去除集合中重复的元素值
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();
		
		//添加元素到集合
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("hello");
		
		//创建新集合
		ArrayList newArray = new ArrayList();
		
		//遍历旧集合
		Iterator it = array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		
		//遍历新集合
		for(int x=0;x<newArray.size();x++){
			String s = (String)newArray.get(x);
			System.out.println(s);
		}
	}
}
