package RedBlackTree;


public class RBTree<K extends Comparable<K>,V> {
	private class Node{
		public static final boolean RED = true;
		public static final boolean BLACK = false;
		public K key;
		public V value;
		public Node left,right;
		public boolean color;
		public Node(K key,V value){
			this.key = key;
			this.value = value;
			left = null;
			right = null;
			color = RED;
		}
	}

	private static final boolean BLACK = false;

	private static final boolean RED = false;
	
	private Node root;
	private int size;
	
	public RBTree() {
		root = null;
		size =0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	//  node                  x
	//  / \     ����ת       /  \
	// T1  x   -------->   node T3
	//    / \              / \
	//   T2 T3            T1 T2
	private Node leftRotate(Node node) {
		Node x = node.right;
		
		//����ת
		node.right = x.left;
		x.left = node;
		
		x.color = node.color;
		node.color = RED;
		
		return x;
	}
	//    node                  x
	//    / \     ����ת       /  \
	//   x   T2  -------->    y   node
	//  / \            		      / \
	// y  T1                     T1 T2
	private Node rightRotate(Node node) {
		
		Node x = node.left;
		//����ת
		node.left = x.right;
		x.right = node;
		
		x.color = node.color;
		node.color = RED;
		
		return x;
	}
	//��ɫ��ת
	private void flipColors(Node node) {
		node.color = RED;
		node.left.color = BLACK;
		node.right.color = BLACK;
	}
	
	//������������µ�Ԫ��
	public void add(K key,V value) {
		root = add(root,key, value);
		root.color = BLACK;//���ո��ڵ�Ϊ��ɫ�ڵ�
	}
	//��ΪNodeΪ���ĺ�����в���Ԫ��(key,value),�ݹ��㷨
	//���ز����½ڵ�������ĸ�
	private Node add(Node node,K key,V value) {
		if(node==null) {
			size++;
			return new Node(key, value);
		}
		if(key.compareTo(node.key)<0) {
			node.left = add(node.left, key, value);
		}
		else if(key.compareTo(node.key)>0) {
			node.right = add(node.right, key, value);
		}
		else {//key.compareTo(node.key)==0
			node.value = value;
		}
		if(isRed(node.right) && !isRed(node.left))
			node = leftRotate(node);
		if(isRed(node.left) && isRed(node.left .left))
			node = rightRotate(node);
		if(isRed(node.left) && isRed(node.right))
			flipColors(node);
		return node;
	}
	private boolean isRed(Node node) {
		return node==null ? false:node.color==RED;
	}
	//������nodeΪ�ڵ�Ķ����������У�key���ڵĽڵ�
	private Node getNode(Node node,K key) {
		if(node==null) {
			return null;
		}
		if(key.compareTo(node.key)==0) {
			return node;
		}
		else if(key.compareTo(node.key)<0) {
			return getNode(node.left, key);
		}
		else {//key.compareTo(node.key)>0
			return getNode(node.right, key);
		} 
	}

	public boolean contains(K key) {
		return getNode(root, key)!=null;
	}

	public V get(K key) {
		Node node = getNode(root, key);
		return node==null? null:node.value;
	}

	public void set(K key,V newValue) {
		Node node = getNode(root, key);
		if(node == null) {
			throw new IllegalArgumentException(key+"doesn't exist!");
		}
		node.value = newValue;
	}
	private Node minimum(Node node) {
		if(node.left==null) {
			return node;
		}
		return minimum(node.left);
	}
	private Node removeMin(Node node) {
		if(node.left==null) {
			Node rightNode = node.right;
			node.right = null;
			size--;
			return node.right;
		}
		node.left = removeMin(node.left);
		return node;
	}

	public V remove(K key) {
		Node node = getNode(root, key);
		if(node!=null) {
			root = remove(root,key);
			return node.value;
		}
		return null;		
	}
	private Node remove(Node node,K key) {
		if(node==null) {
			return null;
		}
		if(key.compareTo(node.key)<0) {
			node.left = remove(node.left, key);
			return node;
		}
		else if(key.compareTo(node.key)>0){
			node.right = remove(node.right, key);
			return node;
		}
		else {//key.compareTo(node.key)==0
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
	public static void main(String[] args) {
		RBTree<Integer,String> map =new RBTree<>();
		long startTime = System.nanoTime();
		for(int i =0;i<5;i++) {
			map.add(i, i+"");
		}
		System.out.println(map.getSize());
		for(int i =0;i<5;i++) { 
			map.add(i, i+"");
		}
		System.out.println(map.getSize());
		long endTime = System.nanoTime();
		System.out.println("����ʱ�䣺"+(endTime-startTime)/1000000000.0);
	}
	
}



