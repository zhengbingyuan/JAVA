package Map;

public class BSTMap<K extends Comparable,V> implements Map<K, V> {
	private class Node{
		public K key;
		public V value;
		public Node left,right;
		public Node(K key,V value){
			this.key = key;
			this.value = value;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	private int size;
	
	public BSTMap() {
		root = null;
		size =0;
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	@Override
	public void add(K key,V value) {
		root = add(root,key, value);
	}
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
		return node;
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
	@Override
	public boolean contains(K key) {
		return getNode(root, key)!=null;
	}
	@Override
	public V get(K key) {
		Node node = getNode(root, key);
		return node==null? null:node.value;
	}
	@Override
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
	@Override
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
		BSTMap<Integer,String> map =new BSTMap<>();
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
