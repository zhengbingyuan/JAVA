package text;
import java.util.Scanner;
import java.util.Stack;

import com.sun.org.apache.bcel.internal.generic.NEW;
public class LeedCode20 {
	public static void main(String [] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		String  a = scanner.nextLine();
		System.out.println(a);
		System.out.println(isValid(a));
		
		System.out.println((new LeedCode20()).isValid("{()}"));

	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if(c==')'&&topChar!='(') {
					return false;
				}
				if(c=='}'&&topChar!='{') {
					return false;
				}  
				if(c==']'&&topChar!='[') {
					return false;
				}		
			}			
		}
		return stack.isEmpty();
	}
	
}

