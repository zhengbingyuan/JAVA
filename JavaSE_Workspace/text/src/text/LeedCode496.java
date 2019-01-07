package text;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;
public class LeedCode496 {
	public static void main(String[] args) {
		int [] out=(new LeedCode496()).nextGreaterElement( new int[] {4,1,2},new int[] {1,3,4,2});
		for(int i=0;i<out.length;i++)
				System.out.println(out[i]);
	}
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Stack<int> stack = new Stack<>();
		int[] stack=new int[nums1.length];
		//int [] stack=nums1;
        //ArrayList<Integer> stack = new ArrayList<>(nums1.length);
        for(int i=0;i<nums1.length;i++){
            boolean bool = false;
            for(int j=0;j<nums2.length;j++){
                
                if(nums1[i]==nums2[j]){
                    bool = true;
                }
                if(bool&&nums2[j]>nums1[i]){
                    bool = false;
                    stack[i]=nums2[j];
                    //stack.push(nums2[j]);
                }
            }
            if(bool){
                stack[i]=-1;
                //stack.push(-1);
            }
        }
        return stack;
    }
}
