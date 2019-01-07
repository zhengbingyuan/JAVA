package MaxHeap;

import java.util.Random;

public class MaxHeap<E extends Comparable> {
	private MyArray<E> data;
	
	public MaxHeap(int capacity) {
		data = new MyArray<>(capacity);
	}
	public MaxHeap(){
		data = new MyArray<>();
	}
	
	//将任意的数组整理成对的形状
	public MaxHeap(E[] arr) {
		data = new MyArray<>(arr);
		for(int i=parent(arr.length-1);i>=0;i--) {
			siftDown(i);
		}
	}
	
	public int size() {
		return data.getSize();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	private int parent(int index) {
		if(index==0) {
			throw new IllegalArgumentException("index-0 doesn't have parent.");
		}
		return (index-1)/2;
	}
	private int leftChild(int index) {
		return index*2+1;
	}
	private int rightChild(int index) {
		return index*2+2;
	}
	
	public void add(E e) {
		data.addLast(e);
		siftUp(data.getSize()-1);
	}
	public void siftUp(int k) {
		while(k>0&&data.get(parent(k)).compareTo(data.get(k))<0) {
			data.swap(k, parent(k));
			k = parent(k);
		}
	}
	public E findMax() {
		if(data.getSize()==0) {
			throw new IllegalArgumentException("Can not findMax when heap is empty.");
		}
		return data.get(0);
	}
	public E extractMax() {
		E ret = findMax();
		data.swap(0, data.getSize()-1);
		data.removelast();
		siftDown(0);
		return ret;
	}
	private void siftDown(int k) {
		while(leftChild(k)<data.getSize()) {
			int j = leftChild(k);
			if(j+1<data.getSize()&&data.get(j+1).compareTo(data.get(j))>0) {
				j = rightChild(k);
			}
			if(data.get(k).compareTo(data.get(j))>=0) {
				break;
			}
			data.swap(k, j);
			k = j;
		}
	}
	//取出堆中的最大元素，并且替换成元素e
	public E replace(E e) {
		E rec = findMax();
		data.set(0, e);
		siftDown(0);
		return rec;
	}
	

	
	public static void main(String[] args) {
		int n = 100;
		MaxHeap<Integer> maxHeap = new MaxHeap<Integer>();
		Random random = new Random();
		for(int i =0;i<n;i++) {
			maxHeap.add(random.nextInt(n));
		}
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = maxHeap.extractMax();
		}
		for(int i =1;i<n;i++) {
			if(arr[i-1]<arr[i]) {
				throw new IllegalArgumentException("Error");
			}
		}
		System.out.println("Test MaxHeap completed");
	}
}
