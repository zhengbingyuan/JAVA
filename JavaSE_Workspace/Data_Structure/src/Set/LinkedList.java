package Set;


public class LinkedList<E> {
	private class Node{
		public E e;
		public Node next;
		
		public Node(E e,Node next) {
			this.e = e;
			this.next = next;
		}
		
		public Node(E e) {
			this(e, null);
		}
		
		public Node() {
			this(null,null);
		}
		
		@Override
		public String toString() {
			//return String.valueOf(e);
			return e.toString();
		}
		
	}
	
	private Node dummyHead;
	int size;
	
	public LinkedList(){
		dummyHead = new Node(null,null);
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	//在链表的index位置添加新的元素e
	//在链表中不是一个常规的操作，练习题
	public void add(int index , E e) {
		if(index<0||index>size) {
			throw new IllegalArgumentException("Add failed. Illegal index.");
		}

		Node prev = dummyHead;
		for(int i=0;i<index;i++) {
			prev= prev.next;
		}
		Node node = new Node(e);
		node.next = prev.next;
		prev.next = node;
		size++;
	}
	
	public void AddFirst(E e) {
		/*
		Node node = new Node(e);
		node.next = dummyHead.next;
		dummyHead.next = node;
		//head = new Node(e,head);
		size++;
		*/
		add(0, e);
	}
	
	//在链表末尾添加新的元素
	public void addLast(E e) {
		add(size, e);
	}
	
	public E get(int index) {
		if(index<0&&index>=size) {
			throw new IllegalArgumentException("Get failed.Illegal index.");
		}
		Node cur = dummyHead.next;
		for(int i=0;i<index;i++) {
			cur = cur.next;
		}
		return cur.e;
	}
	
	public E getFirst() {
		return get(0);
	}
	public E getLast() {
		return get(size-1);
	}
	
	public void set(int index,E e) {
		if(index<0&&index>=size) {
			throw new IllegalArgumentException("Get failed.Illegal index.");
		}
		Node cur = dummyHead.next;
		for(int i=0;i<index;i++) {
			cur = cur.next;
		}
		cur.e = e;
	}
	
	public boolean contains(E e) {
		Node cur = dummyHead.next;
		while(cur!=null) {
			if(cur.e.equals(e))
				return true;
			cur= cur.next;
		}
		return false;
	}
	
	public E remove(int index) {
		if(index<0&&index>=size) {
			throw new IllegalArgumentException("Get failed.Illegal index.");
		}
		Node prev = dummyHead;
		for(int i=0;i<index;i++) {
			prev=prev.next;
		}
		Node retNode =prev.next;
		prev.next = retNode.next;
		retNode.next = null;
		size--;
		return retNode.e;
	}
	
	public E removeFirst() {
		return remove(0);
	}
	
	public E removeLast() {
		return remove(size-1);
	}
	
	//从链表中删除元素e
	public void removeElement(E e) {
		Node pre = dummyHead;
		while(pre.next!=null) {
			if(pre.next.e.equals(e)) {
				break;
			}
			pre = pre.next;
		}
		if(pre.next!=null) {
			Node delNode = pre.next;
			pre.next = delNode.next;
			delNode.next = null;
			size--;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		Node cur = dummyHead.next;
		while(cur!=null) {
			res.append(cur+"->");
			cur = cur.next;
		}
		res.append("NULL");
		return res.toString();
	}
	
	public static void main(String [] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i=0;i<5;i++) {
			linkedList.AddFirst(i);
			System.out.println(linkedList);
		}
		
		linkedList.add(2,600);
		System.out.println(linkedList);
		
		linkedList.remove(2);
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
	}
	
}
