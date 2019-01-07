package LeedCode;
/*
 * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
  * ����:[4,5,1,9]
 * 	  5
  * ���: [4,1,9]
  * ����: ������������ֵΪ 5 �ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮��
 * 	     ������Ӧ��Ϊ 4 -> 1 -> 9.
 * 
 *
 */
import java.util.Scanner;

class ListNode1 {
	 int val;
    ListNode1 next;
    ListNode1(int x) { val = x; }
}
class Solution237 {
    public void deleteNode(ListNode1 node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
        
    }
}
public class LeedCode237 {
	
	public static int[] stringToIntegerArray(String input) {
		input = input.trim();
		input = input.substring(1, input.length()-1);
		if(input.length()==0) {
			return new int[0];
		}
		String[] parts = input.split(",");
		int[] output = new int[parts.length];
		for(int i = 0;i<parts.length;i++) {
			String part = parts[i].trim();
			output[i] = Integer.parseInt(part);
		}
		return output;
	}
	
	public static ListNode1 stringToListNode(String input) {
		int[] nodeValues = stringToIntegerArray(input);
		
		ListNode1 dummyNode = new ListNode1(-1);
		ListNode1 ptr = dummyNode;
		for(int i = 0;i<nodeValues.length;i++) {
			ptr.next = new ListNode1(nodeValues[i]);
			ptr = ptr.next;
		}
		return dummyNode.next;
	}
	
	public static ListNode1 deleNumberNode(ListNode1 node,int deleNumber) {
		ListNode1 dummyNode = new ListNode1(-1);
		dummyNode.next = node;
		ListNode1 ptr = dummyNode.next;
		while(ptr!=null) {
			if(ptr.val==deleNumber) {
				return ptr;
			}
			ptr = ptr.next;
		}
		return null;
	}
	
	public static void printLinkedList(ListNode1 node) {
		while(node!=null&&node.next!=null) {
			System.out.print(node.val+"->");
			node = node.next;
		}
		if(node!=null) {
			System.out.print(node.val);
		}
		else {
			System.out.println("Empty LinkedList.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		while((line = sc.nextLine())!=null) {
			int deleteNumber = sc.nextInt();
			ListNode1 node = stringToListNode(line);
			Solution237 solution = new Solution237();
			ListNode1 deleNode = deleNumberNode(node,deleteNumber);
			solution.deleteNode(deleNode);
			printLinkedList(node);
			sc.nextLine();
			sc.nextLine();
		}
	}
}
