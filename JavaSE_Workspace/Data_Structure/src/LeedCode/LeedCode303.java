package LeedCode;

import SegmentTree.SegmentTree;


class NumArray2 {
	private int[] sum;
    public NumArray2(int[] nums) { 
       sum = new int[nums.length+1];
    	sum[0]=0;
    	for(int i =1;i<nums.length+1;i++) {
    		sum[i]= sum[i-1]+nums[i-1];
    	}
    }
    
    public int sumRange(int i, int j) {
    	return sum[j+1]-sum[i];
    }
}

public class LeedCode303 {
	
	class NumArray {
		private SegmentTree<Integer> segmentTree;

	    public NumArray(int[] nums) {
	        if(nums.length>0) {
	        	Integer[] data =new Integer[nums.length];
	        	for (int i = 0; i < nums.length; i++) {
					data[i] = nums[i];
				}
	        	segmentTree = new SegmentTree<Integer>(data, (a,b)->a+b);
	        }
	    }
	    
	    public int sumRange(int i, int j) {
	    	if(segmentTree==null) {
	    		throw new IllegalArgumentException("Segment Tree is null.");
	    	}
	        return segmentTree.query(i, j);
	    }
	}
	

	
	public static void main(String[] args) {
		int[] nums = new int[] {-2,0,3,-5,2,1};
		NumArray2 solution = new NumArray2(new int[] {-2,0,3,-5,2,1});
		int res =solution.sumRange(0, 5);
		System.out.println(res);

		
	}
}
