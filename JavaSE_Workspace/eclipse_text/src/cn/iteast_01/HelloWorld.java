package cn.iteast_01;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MyComparator1 implements Comparator<String>{
    @Override
     public int compare(String o1, String o2) {
      /*如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
       这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了*/
     return Integer.valueOf(o2)-Integer.valueOf(o1);    
    }
}
public class HelloWorld {

	public static int compare11(String o1, String o2) {
        /*如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
         这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了*/
    	  int length1 = o1.length();
    	  int length2 = o2.length();
    	  if(length1==length2)
    		  return Integer.valueOf(o2)-Integer.valueOf(o1);   
    	  else if(length1>length2) {
    		  for (int i = 0; i < length2; i++) {
    			  char c1=o1.charAt(i);
    			  char c2=o2.charAt(i);
    			  if(c1-c2>0) {
    				  return 1;
    			  }
    			  if(c1-c2<0) {
    				  return -1;
    			  }
    		  }
    		  if(o1.charAt(length2)>o1.charAt(0)) {
    			  return 1;
    		  }else
    			  return -1;
    	  }
    	  else {
    		  for (int i = 0; i < length1; i++) {
    			  char c1=o1.charAt(i);
    			  char c2=o2.charAt(i);
    			  if(c1-c2>0) {
    				  return 1;
    			  }
    			  if(c1-c2<0) {
    				  return -1;
    			  }
			}
    		if(o2.charAt(length1)>o2.charAt(0)) {
    			return -1;
    		}else
    			return 1;
    	  }
    	   
      }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helloworld");
		Comparator<String> MyComparator=new Comparator<String>()  {
		      @Override
		      public int compare(String o1, String o2) {
		          /*如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
		           这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了*/
		      	  int length1 = o1.length();
		      	  int length2 = o2.length();
		      	  if(length1==length2)
		      		  return Integer.valueOf(o2)-Integer.valueOf(o1);   
		      	  else if(length1>length2) {
		      		  for (int i = 0; i < length2; i++) {
		      			  char c1=o1.charAt(i);
		      			  char c2=o2.charAt(i);
		      			  if(c1-c2>0) {
		      				  return 1;
		      			  }
		      			  if(c1-c2<0) {
		      				  return -1;
		      			  }
		      		  }
		      		  if(o1.charAt(length2)>o1.charAt(0)) {
		      			  return 1;
		      		  }else
		      			  return -1;
		      	  }
		      	  else {
		      		  for (int i = 0; i < length1; i++) {
		      			  char c1=o1.charAt(i);
		      			  char c2=o2.charAt(i);
		      			  if(c1-c2>0) {
		      				  return 1;
		      			  }
		      			  if(c1-c2<0) {
		      				  return -1;
		      			  }
		  			}
		      		if(o2.charAt(length1)>o2.charAt(0)) {
		      			return -1;
		      		}else
		      			return 1;
		      	  }
		    	   
		      }
		};
		Comparator cmp = new MyComparator1();
        Scanner sc = new Scanner(System.in);
        int res=compare11("82","821");
        int res1=compare11("821","82");
        int res2=compare11("12","123");
        int res3=compare11("123","12");
        System.out.println(res+" "+res1+""+res2+" "+res3);
        while(sc.hasNext()){
            String n=sc.nextLine();
            String line=sc.nextLine();
            String[] nums=line.split(" ");
            //Arrays.sort(nums,Collections.reverseOrder());
            Arrays.sort(nums,MyComparator);
            //Arrays.sort(nums,cmp);
            StringBuilder sb = new StringBuilder();
            for(int i =0;i<nums.length;i++){
                sb.append(nums[i]);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
       
	}



}
