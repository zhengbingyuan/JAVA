package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection:集合
 * 带All方法
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		//添加一个集合元素
		//System.out.println("addAll:"+c1.addAll(c2));
		
		//移除集合元素，只要有一个被移除了就返回ture
		//System.out.println("removeAll:"+c1.removeAll(c2));
		
		//判断是否包含一个集合元素,包含全部集合元素才返回ture
		//System.out.println("contains:"+c1.containsAll(c2));
		
		//返回两个集合元素的交集，A.retainAll(B)结果存储在A中
		//返回值表示是A是否发生过改变。改变为ture，不改变为false
		System.out.println("retainAll:"+c1.retainAll(c2));
		
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		
	}
}
