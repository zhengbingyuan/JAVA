package cn.iteast_01;
import java.util.Scanner;
public class text {
	public static void main(String[] args){
		
		String count1,count2,count3;
        
    	Scanner stdin = new Scanner(System.in);  
		count1=stdin.nextLine();
		count2=stdin.nextLine();
		count3=stdin.nextLine();
		//count2 = count2.trim();
		String[] numstr1 = count2.split(" ");
	        int[] nums1 = new int[numstr1.length];
	        for(int i = 0; i < numstr1.length; i ++) {
	            nums1[i] = Integer.parseInt(numstr1[i]);
	            System.out.println(nums1[i]);
	        }
	    //count3 = count3.trim();
		 String[] numstr2 = count3.split(" ");
		    int[] nums2 = new int[numstr2.length];
		    for(int i = 0; i < numstr2.length; i ++) {
		        nums2[i] = Integer.parseInt(numstr2[i]);
		        System.out.println(nums2[i]);
		    }	     
		
		
		
		//System.out.println(count1);
		//System.out.println(count2);
		//System.out.println(count3);
	}
}
