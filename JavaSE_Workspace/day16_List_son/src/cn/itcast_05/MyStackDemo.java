package cn.itcast_05;

public class MyStackDemo {
	public static void main(String[] args) {
		//��������
		MyStack<String> stack = new MyStack<>();
		
		//���Ԫ��
		stack.add("hello");
		stack.add("world");
		stack.add("java");
		
		System.out.println(stack.get());
		System.out.println(stack.get());
		
	}
}
