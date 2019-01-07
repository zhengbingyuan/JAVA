package Set;

import AVLTree.AVLTree;

public class AVLSet<E extends Comparable<E>> implements Set<E> {
	
	private AVLTree<E, Object>  avl;
	public AVLSet() {
		avl = new AVLTree<>();
	}
	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		avl.add(e, null);
	}

	@Override
	public void remove(E e) {
		// TODO Auto-generated method stub
		avl.remove(e);
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return avl.contains(e);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return avl.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return avl.isEmpty();
	}
	
	
}
