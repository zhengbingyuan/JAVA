package ArrayDemoList;

public class ArrayStackDemo {
	public static void main(String [] arge) {
	
		ArrayStack<Integer> stack = new ArrayStack<>();
		for(int i =0;i<5;i++) {
			stack.push(i);	
			System.out.println(stack);
		}
		stack.pop();
		System.out.println(stack);
	}
}
