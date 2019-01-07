package cn.itcast_04;
/*
 * 判断集合里有没有world，如果有就添加一个"javaee"元素
 * 利用通用迭代器iterator方法，出现错误原因：
 * 		迭代器是依赖于集合而存在的，在判断成功后，集合的中添加了元素，
 * 		而迭代器却不知道，所以就报错，这个错误叫并发修改异常
 * 		其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的
 * 如何解决呢？
 * 		A:迭代器迭代元素，迭代器修改元素
 * 			元素是跟在刚才迭代的元素的后面的。
 * 		B:集合遍历元素，集合修改元素（普通for）
 * 			元素在最后面添加
 * 		
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//创建List集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//迭代器遍历
		//此方法是错误的，因为集合改变，迭代器没变
	/*	Iterator it = list.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if("world".equals(s)){
				list.add("javaee");
			}	
		}*/
		
		//改进，方法一 迭代器遍历
	/*	ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s= (String)lit.next();
			if("world".equals(s)){
				lit.add("javaee");
			}
		}*/
		
		//方法二 集合遍历
		for(int x =0;x<list.size();x++){
			String s= (String)list.get(x);
			if("world".equals(s)){
				list.add("javaee");	
			}
		}
		System.out.println("list:"+list);
	}
}
