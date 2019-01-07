package LeedCode;

import java.util.ArrayList;
import java.util.TreeMap;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums1.length;i++) {
        	list.add(nums1[i]);
        }
        ArrayList<Integer> resList = new ArrayList<>();
        for(int num:nums2) {
        	if(list.contains(num)) {
        		resList.add(num);
        		list.remove(Integer.valueOf(num));
        	}
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
			res[i] = resList.get(i);
		}
        return res;
    }
    public int[] intersect1(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i =0;i<nums1.length;i++) {
        	if(!map.containsKey(nums1[i]))
        		map.put(nums1[i],1);
        	else
        		map.put(nums1[i], map.get(nums1[i])+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums2) {
        	if(map.containsKey(num)) {
        		list.add(num);
        		map.put(num, map.get(num)-1);
        		if(map.get(num)==0) {
        			map.remove(num);
        		}
        	}
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}
        return res;
    }
}

public class LeedCode350 {
	public static void main(String [] args) {
		Solution350 solution = new Solution350();
		int [] nums1= {4,9,5};
		int [] nums2= {9,4,9,8,4};
		int[] res = solution.intersect(nums1, nums2);
		for(int i =0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
