package Map;

import AVLTree.AVLTree;

public class AVLMap<K extends Comparable<K>,V> implements Map<K, V> {
	private AVLTree<K, V> avlTree;
	public AVLMap(){
		avlTree = new AVLTree<>();
	}
	@Override
	public void add(K key, V value) {
		// TODO Auto-generated method stub
		avlTree.add(key, value);
	}
	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean contains(K key) {
		// TODO Auto-generated method stub
		return avlTree.contains(key);
	}
	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return avlTree.get(key);
	}
	@Override
	public void set(K key, V value) {
		// TODO Auto-generated method stub
		avlTree.set(key, value);
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return avlTree.getSize();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return avlTree.isEmpty();
	}
	
}
