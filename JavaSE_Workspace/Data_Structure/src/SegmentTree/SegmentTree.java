package SegmentTree;

import java.util.Set;

public class SegmentTree<E> {
	private E[] tree;
	private E[] data;
	private Merger<E> merger;
	public SegmentTree(E[] arr,Merger<E> merger) {
		this.merger = merger;
		
		data = (E[])new Object[arr.length];
		for(int i =0 ;i<arr.length;i++) {
			data[i] = arr[i];
		}
		tree = (E[])new Object[4*arr.length];
		buildSegmentTree(0, 0, data.length-1);
	}
	
	public int getSize() {
		return data.length;
	}
	
	public E get(int index) {
		if(index<0||index>=data.length) {
			throw new IllegalArgumentException("Index is illagal.");
		}
		return data[index];
	}
	
	private int leftChild(int index) {
		return 2*index+1;
	}
	
	private int rightChild(int index) {
		return 2*index+2;
	}
	
	//在treeIndex的位置创建表示区间[l...r]的线段树
	private void buildSegmentTree(int treeIndex,int l,int r) {
		if(l==r) {
			tree[treeIndex] = data[l];
			return;
		}
		int leftTreeIndex = leftChild(treeIndex);
		int rightTreeIndex = rightChild(treeIndex);
		int mid = l + (r-l)/2;
		buildSegmentTree(leftTreeIndex, l, mid);
		buildSegmentTree(rightTreeIndex, mid+1, r);
		tree[treeIndex] =merger.merger(tree[leftTreeIndex],tree[rightTreeIndex]);
	}
	public E query(int queryL,int queryR) {
		if(queryL<0||queryL>=data.length||queryR<0||queryR>=data.length) {
			throw new IllegalArgumentException("Index is illegal");
		}
		
		return query(0,0,data.length-1, queryL,queryR);
	}
	//在以treeID为根的线段树中[l...r]的范围里，搜索区间[queryR...queryR]的值
	private E query(int treeIndex,int l,int r,int queryL,int queryR) {
		if(l==queryL&&r==queryR) {
			return tree[treeIndex];
		}
		int leftTreeIndex = leftChild(treeIndex);
		int rightTreeIndex = rightChild(treeIndex);
		int mid = l + (r-l)/2;
		if(queryL>=mid+1) {
			return query(rightTreeIndex, mid+1,r,queryL,queryR);
		}
		else if(queryR<=mid) {
			return query(leftTreeIndex, l,mid,queryL,queryR);
		}
		
		E leftResult = query(leftTreeIndex, l, mid, queryL, mid);
		E rightResult = query(rightTreeIndex, mid+1, r, mid+1, queryR);
		return merger.merger(leftResult, rightResult);
	}
	public void set(int index,E e) {
		if(index<0||index>=data.length) {
			throw new IllegalArgumentException("Index is illagal.");
		}
		data[index] = e;
		set(0, 0,data.length-1,index,e);
	}
	public void set(int treeIndex,int l,int r,int index,E e) {
		if(l==r) {
			tree[treeIndex] =e;
			return;
		}
		int mid = l+ (r-l)/2;
		int leftTreeIndex = leftChild(treeIndex);
		int rightTreeIndex = rightChild(treeIndex);
		if(index>=mid+1) {
			set(rightTreeIndex, mid+1,r,index,e);
		}
		else if(index<=mid) {
			set(leftTreeIndex, l,mid,index,e);
		}
		tree[treeIndex] =merger.merger(tree[leftTreeIndex],tree[rightTreeIndex]);
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append('[');
		for(int i=0;i<tree.length;i++) {
			if(tree[i]!=null) {
				res.append(tree[i]);
			}
			else {
				res.append("null");
			}
			if(i!=tree.length-1) {
				res.append(',');
			}
		}
		res.append(']');
		return res.toString();
	}
	
	public static void main(String[] args) {
		Integer[] nums = {-2,0,3,-5,2,1};
		SegmentTree<Integer> segmentTree = new SegmentTree<Integer>(nums, new Merger<Integer>() {
			@Override
			public Integer merger(Integer a,Integer b) {
				return a+b;
			}
		});
		System.out.println(segmentTree.query(0, 2));
		System.out.println(segmentTree);		
		
	}
	

	
}
