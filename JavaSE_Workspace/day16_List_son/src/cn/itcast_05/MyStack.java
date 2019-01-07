package cn.itcast_05;
/**
 *  �Զ����ջ����
 *  @author ZBY
 *  @version V1.0
 */

import java.util.LinkedList;

public class MyStack<E> {
	private LinkedList<E> link;
	
	MyStack(){
		link = new LinkedList<>();
	}
	
	public void add(E obj) {
		link.addFirst(obj);
	}
	
	public E get() {
		return link.removeFirst();
	}
	
	public boolean isEmpty() {
		return link.isEmpty();
	}
}