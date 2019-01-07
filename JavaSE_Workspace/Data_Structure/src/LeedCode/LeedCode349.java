package LeedCode;
import java.util.ArrayList;
import java.util.TreeSet;

import Set.LinkedListSet;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums1) {
        	set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums2) {
        	if(set.contains(num)) {
        		list.add(num);
        		set.remove(num);
        	}
        }
        int[] res = new int[list.size()];
        for(int i = 0; i<list.size();i++) {
        	res[i] = list.get(i);
        }
        return res;
    }
}
public class LeedCode349 {
	public static void main(String[] args) {
		Solution349 solution = new Solution349();
		int [] nums1= {1,2,2,1};
		int [] nums2= {2,2};
		int[] res = solution.intersection(nums1, nums2);
		for(int i =0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}