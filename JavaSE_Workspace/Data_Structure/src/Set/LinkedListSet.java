package Set;

public class LinkedListSet<E> implements Set<E> {
	private LinkedList<E> list;
	public LinkedListSet(){
		list = new LinkedList<>();
	}
	
	@Override
	public int getSize() {
		return list.getSize();
	}
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public boolean contains(E e) {
		return list.contains(e);
	}
	
	@Override
	public void add(E e) {
		if(!list.contains(e)) {
			list.AddFirst(e);
		}
	}
	@Override
	public void remove(E e) {
		list.removeElement(e);
	}
	
	public static void main(String[] args) {
		LinkedListSet<Integer> set  = new LinkedListSet<>();
		for(int i =0 ;i<5;i++) {
			set.add(i);
		}
		System.out.println(set.getSize());
		for(int i =0 ;i<5;i++) {
			set.add(i);
		}
		System.out.println(set.getSize());
	}
	
}
