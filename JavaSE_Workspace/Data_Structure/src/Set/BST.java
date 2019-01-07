package Set;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.NamedNodeMap;

import com.sun.xml.internal.bind.marshaller.MinimumEscapeHandler;

public class BST<E extends Comparable<E>> {
	private class Node{
		public E e;
		public Node left,right;
		
		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	private int size;
	
	public BST() {
		root = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}

	/*
	//�ݹ�ʵ��Ԫ�ز��룬�����Ӻ��Һ���Ϊ�յ�ʱ����еݹ�
	public void add(E e) {
		if(root==null) {
			root = new Node(e);
			size++;
		}
		else {
			add(root,e);
		}
	}
	private void add(Node node,E e) {
		if(e.compareTo(node.e)==0)
			return;
		else if(e.compareTo(node.e)<0&&node.left==null) {
			node.left = new Node(e);
			size++;
			return;
		}
		else if(e.compareTo(node.e)>0&&node.right==null) {
			node.right = new Node(e);
			size++;
			return;
		}
		
		if(e.compareTo(node.e)<0) {
			add(node.left,e);
		}
		else {
			add(node.right, e);
		}
	}
	*/
	
	//�ݹ�ʵ�����Ԫ�أ��Խڵ��Ƿ�Ϊ�ս��еݹ�
	public void add(E e) {
		root = add(root,e);
	}
	//��nodeΪ���Ķ��������������Ԫ��e
	//���ز����½ڵ��Ķ����������ĸ�
	private Node add(Node node,E e) {
		if(node==null) {
			size++;
			return new Node(e);
		}
		
		if(e.compareTo(node.e)<0) {
			node.left = add(node.left, e);
		}
		else if(e.compareTo(node.e)>0) {
			node.right = add(node.right, e);
		}
		return node;
	}
	
	//���������������Ƿ����Ԫ��e
	public boolean contains(E e) {
		return contains(root,e);
	}
	private boolean contains(Node node,E e) {
		if(node==null) {
			return false;
		}
		if(e.compareTo(node.e)==0)
			return true;
		else if(e.compareTo(node.e)<0) {
			return contains(node.left,e);
		}
		else  //if(e.compareTo(node.e)>0)
		{
			return contains(node.right, e);
		}
	}
	
	//������������ǰ�����
	public void preOrder() {
		preOrder(root);
	}
	//ǰ�������nodeΪ���Ķ������������ݹ��㷨
	private void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}
	//ǰ������ǵݹ�
	public void preOrderNR() {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			Node cur = stack.pop();
			System.out.println(cur.e);
			if(cur.right!=null) {
				stack.push(cur.right);
			}
			if(cur.left!=null) {
				stack.push(cur.left);
			}
		}
	}
	//��������ǵݹ�һ��д��
	public void inOrderNR() {
		Stack<Node> stack = new Stack<>();
		Node node = root;
		while(node!=null||!stack.isEmpty()) {
			while(node!=null) {
				stack.push(node);
				node = node.left;
			}
			if(!stack.isEmpty()) {
				node = stack.pop();
				System.out.println(node.e);
				node = node.right;
			}
		}
	}
	//��������ǵݹ�
	public void postOrderNR() {
		Stack<Node> stack = new Stack<>();
		Node node = root;
		Node lastVisit = root;
		while(node!=null||!stack.isEmpty()) {
			while(node!=null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.peek();
			if(node.right==null||node.right==lastVisit) {
				System.out.println(node.e);
				stack.pop();
				lastVisit = node;
				node = null;
			}
			else {
				node  = node.right;
			}
		}
	}
	
	
	//�������
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node node) {
		if(node == null) {
			return ;
		}
		inOrder(node.left);
		System.out.println(node.e);
		inOrder(node.right);
	}
	//�������
	public void postOrder() {
		postOrder(root);
	}
	private void postOrder(Node node) {
		if(node == null) {
			return ;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.e);
	}
	//��������������ȱ���
	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Node node=null;
		while(!queue.isEmpty()) {
			node = queue.remove();
			System.out.println(node.e);
			if(node.left!=null) {
				queue.add(node.left);
			}
			if(node.right!=null) {
				queue.add(node.right);
			}
			
		}
	}
	//Ѱ�Ҷ�������������СԪ��
	public E minimum() {
		if(size == 0) {
			throw new IllegalArgumentException("BST Is Empty");
		}
		return minimum(root).e;
	}
	
	private Node minimum(Node node) {
		if(node.left==null)
			return node;
		return minimum(node.left);
	}
	//Ѱ�Ҷ��������������Ԫ��
	public E maximum() {
		if(size == 0) {
			throw new IllegalArgumentException("BST Is Empty");
		}
		return maximum(root).e;
	}
	
	private Node maximum(Node node) {
		if(node.right==null)
			return node;
		return maximum(node.right);
	}
	
	//ɾ����С�ڵ�
	public E removeMin() {
		E ret = minimum();
		root = removeMin(root);
		return ret;
	}
	//ɾ������nodeΪ���Ķ�������������С�ڵ�
	//����ɾ���ڵ���µĶ����������ĸ�
	private Node removeMin(Node node) {
		if(node.left==null) {
			Node rightNode = node.right;
			node.right = null;
			size--;
			return rightNode;
		}
		node.left = removeMin(node.left);
		return node;
	}
	
	//ɾ�����ڵ�
	public E removeMax() {
		E ret = maximum();
		root = removeMax(root);
		return ret;
	}
	//ɾ������nodeΪ���Ķ��������������ڵ�
	//����ɾ���ڵ���µĶ����������ĸ�
	private Node removeMax(Node node) {
		if(node.right==null) {
			Node leftNode = node.left;
			node.left = null;
			size--;
			return leftNode;
		}
		node.right = removeMax(node.right);
		return node;
	}
	
	public void remove(E e) {
		root = remove(root,e);
	}
	
	private Node remove(Node node,E e) {
		if(node == null) {
			return null;
		}
		if(e.compareTo(node.e)<0) {
			node.left = remove(node.left, e);
			return node;
		}
		else if(e.compareTo(node.e)>0) {
			node.right = remove(node.right, e);
			return node;
		}
		else {//e.compareTo(node.e)==0
			//��ɾ���Ľڵ�������Ϊ�յ����
			if(node.left==null) {
				Node rightNode = node.right;
				node.right = null;
				size--;
				return rightNode;
			}
			//��ɾ���Ľڵ�������Ϊ�յ����
			if(node.right==null) {
				Node leftNode = node.left;
				node.left = null;
				size--;
				return leftNode;
			}
			//��ɾ���Ľڵ�������������Ϊ�յ����
			//�ҵ��ȴ�ɾ���ڵ�����С�ڵ㣬��ɾ���ڵ�����������С�ڵ�
			//������ڵ㶥���ɾ���ڵ��λ��
			Node successor = minimum(node.right);
			successor.right = removeMin(node.right);
			successor.left = node.left;
			node.left = node.right = null;
			return successor;
		}
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateBSTString(root,0,res);
		return res.toString();
	}
	private void generateBSTString(Node node,int depth,StringBuilder res) {
		if(node == null) {
			res.append(generateDepthString(depth)+"null\n");
			return;
		}
		res.append(generateDepthString(depth)+node.e+"\n");
		generateBSTString(node.left, depth+1, res);
		generateBSTString(node.right, depth+1, res);
	}
	private String generateDepthString(int depth) {
		StringBuilder res = new StringBuilder();
		for(int i =0;i<depth;i++) {
			res.append("--");
		}
		return res.toString();
	}
	
	
	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		int[] nums = {5,3,6,8,4,2};
		for(int num:nums) {
			bst.add(num);
		}
		//       5
		//      / \
		//     3   6
		//    / \   \
		//   2   4   8
		System.out.println("ǰ��ݹ�");
		bst.preOrder();
		System.out.println("ǰ��ǵݹ�");
		bst.preOrderNR();
		System.out.println("����ݹ�");
		bst.inOrder();
		System.out.println("����ǵݹ�");
		bst.inOrderNR();
		System.out.println("����ݹ�");
		bst.postOrder();
		System.out.println("����ǵݹ�");
		bst.postOrderNR();
		System.out.println("��������������ȱ���");
		bst.levelOrder();
		System.out.println("ɾ����СԪ��");
		bst.removeMin();
		bst.inOrder();
		System.out.println("ɾ��ĳԪ��");
		bst.remove(3);
		bst.inOrder();
		System.out.println("toString����");
		System.out.println(bst);
	}
	
}
