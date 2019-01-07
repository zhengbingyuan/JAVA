package LeedCode;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

class ListNode{
	int val;
	public ListNode next;
	public ListNode(int x) {
		// TODO Auto-generated constructor stub
		val = x;
	}
}

class Solution3{
	public ListNode removeElements(ListNode head,int val) {
		if(head==null) {
			return null;
		}
		ListNode res = removeElements(head.next, val);
		if(head.val==val) {
			return res;
		}
		else {
			head.next = res;
			return head;
		}
	}
}

class Solution2{
	public ListNode removeElements(ListNode head,int val) {
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;
		
		ListNode prev = dummyHead;
		while(prev.next!=null) {
			if(prev.next.val==val) {
				ListNode delNode = prev.next;
				prev.next = delNode.next;
				delNode = null;
			}
			else {
				prev = prev.next;
			}
		}
		return dummyHead.next;
	}
}

class Solution{
	public ListNode removeElements(ListNode head, int val) {
		while(head!=null&&head.val==val) {
			ListNode deListNode = head;
			head = head.next;
			deListNode.next = null;
		}
		if(head==null)
			return null;
		ListNode prev = head;
		while(prev.next!=null) {
			if(prev.next.val==val) {
				ListNode deListNode = prev.next;
				prev.next = deListNode.next;
				deListNode = null;
			}
			else {
				prev = prev.next;
			}
		}	
		return head;
	}
}

public class LeedCode203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size =0;
		ListNode head=null; 
		ListNode pre=null;
		boolean flag=true;
		while(size!=7) {
			if(flag) {
				head = new ListNode(sc.nextInt());
				head.next = null;
				flag = false;
				pre = head;
			}
			else {
				ListNode node = new ListNode(sc.nextInt());
				node.next = null;
				pre.next= node;
				pre = node;
			}	
			size++;

		}
		int val = sc.nextInt();
		
		Solution3 reSolution = new Solution3();
		ListNode out = reSolution.removeElements(head,val);
		if(out !=null) {
			System.out.print(out.val+"->");
			while(out.next!=null) {
				if(out.next.next==null)
					System.out.print(out.next.val);
				else
					System.out.print(out.next.val+"->");
				out = out.next;
			}
		}		
	}
	
	
	
}
