package cn.itcast_05;

public class MyStackDemo {
	public static void main(String[] args) {
		//创建集合
		MyStack<String> stack = new MyStack<>();
		
		//添加元素
		stack.add("hello");
		stack.add("world");
		stack.add("java");
		
		System.out.println(stack.get());
		System.out.println(stack.get());
		
	}
}
