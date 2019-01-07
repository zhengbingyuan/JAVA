package ArrayDemoList;

public class MyArray<E> {
	private E[] data;
	private int size;
	/**
	 * 
	 * @param capacity
	 */
	//构造函数
	public MyArray(int capacity) {
		data =(E[])new Object[capacity];
		size = 0;
	}
	public MyArray()
	{
		this(10);
	}
	//返回数组大小
	public int getSize()
	{
		return size;
	}
	//返回数组容量
	public int getCapacity()
	{
		return data.length;
	}
	//返回数据是否为空
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void addLast(E e)
	{
		add(size, e);
	}
	public void addFirst(E e) {
		add(0, e);
	}
	
	public void add(int index,E e) {
		
		if(index<0||index>size) {
			throw new IllegalArgumentException("Add failed. Require index >= 0 and index <=size");
		}
		
		if(size==data.length) {
			resize(2*data.length);
		}
		
		for(int i=size-1;i>=index;i--) {
			data[i+1] =data[i];
		}
		data[index]=e;
		size++;
	}
	
	public E get(int index) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("Get failed. Require index >= 0 and index <size");
		}
		return data[index];
	}
	
	public E getLast() {
		return get(size-1);
	}
	
	public E getFirst() {
		return get(0);
	}
	
	public void set(int index, E e) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("Set failed. Require index >= 0 and index <size");
		}
		data[index]=e;
	}
	//是否包含元素e
	public boolean contains(E e) {
		for(int i=0;i<size;i++) {
			if(data[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
	//查找元素索引
	public int find(E e) {
		for(int i=0;i<size;i++) {
			if(data[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}
	
	public E remove(int index) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("Set failed. Require index >= 0 and index <size");
		}
		E ret = data[index];
		for(int i=index;i<size-1;i++) {
			data[i]=data[i+1];
		}
		size--;
		data[size]=null;
		
		if(size==data.length/4&&data.length/2!=0) {
			resize(data.length/2);
		}
		
		return ret;
	}
	
	public E removeFirst() {
		return remove(0);
	}
	
	public E removelast() {
		return remove(size-1);
	}
	
	public void removeElement(E e) {
		int index = find(e);
		if(index!=-1){
			remove(index);
		}
	}
	
	@Override 
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array:size = %d , capacity: = %d\n", size,data.length));
		res.append("[");
		for(int i=0;i<size;i++)
		{
			res.append(data[i]);
			if(i!=size-1) {
				res.append(",");
			}
		}
		res.append("]");
		return res.toString();
	}
	
	private void resize(int newCapacity) {
		E[] newData = (E[])new Object[newCapacity];
		for(int i=0;i<size;i++) {
			newData[i]=data[i];
		}
		data=newData;
	}
	
}
