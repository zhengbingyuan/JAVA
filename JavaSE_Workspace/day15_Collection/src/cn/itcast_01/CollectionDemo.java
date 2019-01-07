package cn.itcast_01;
/*
 * Collection：集合
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		
		//创建集合对象
		Collection c = new ArrayList();
		
		//System.out.println("add:"+c.add("hello"));
		//单个添加
		c.add("hello");
		c.add("world");
		c.add("java");
		//清除
		//c.clear();
		
		//单个移除
		//System.out.println("remove:"+c.remove("hello"));
		//System.out.println("remove:"+c.remove("javaee"));
		
		//判断是否包含
		//System.out.println("contains:"+c.contains("hello"));
		
		//判断是否为空
		//System.out.println("isEmpty:"+c.isEmpty());
		
		//长度
		System.out.println("size:"+c.size());
		System.out.println("c:"+c);
		
	}
}
