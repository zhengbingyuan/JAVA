package LeedCode;


class NumArray307 {
	private int[] sum;
	private int[] data;
    public NumArray307(int[] nums) {
    	data = new int[nums.length];
        sum = new int[nums.length+1];
    	sum[0]=0;
    	for(int i =1;i<nums.length+1;i++) {
    		data[i-1] = nums[i-1];
    		sum[i]= sum[i-1]+nums[i-1];
    	}
    }
	public void update(int i, int val) {
		data[i] = val;
		for (int j = i+1; j < data.length+1; j++) {
			sum[j] = sum[j-1]+data[j-1];
		}
	}
    public int sumRange(int i, int j) {
    	return sum[j+1]-sum[i];
    }
}

public class LeedCode307 {
	public static void main(String[] args) {
		NumArray307 solution = new NumArray307(new int[] {-2,0,3,-5,2,1});
		int res =solution.sumRange(0, 5);
		System.out.println(res);
		solution.update(1, 10);
		System.out.println(solution.sumRange(0, 5));
	}
}
