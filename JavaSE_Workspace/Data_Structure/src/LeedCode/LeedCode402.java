package LeedCode;
/**
  * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
  * 删除整数的k个数字，获得删除后的最小值
 * @param num  原整数
 * @param k  删除数量
 * 
  * 输入: "1432219"
 *  	3
  * 输出: "1219"
  * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
 */

class Solution5 {
    public static String removeKdigits(String num, int k) {
        int flag =0;
        String newStr = num;
    	for(int i =0;i<newStr.length()-1;i++) {
    		if(flag==k) break;
        	if(newStr.charAt(i)>newStr.charAt(i+1)) {
        		newStr = newStr.substring(0, i)+newStr.substring(i+1);
        		if(newStr.length()>1&&i>=1) 
        			i=i-2;
        		else
        			i--;
        		flag++;
        	}
        }
    	
    	for(int i =flag;flag<k;i++){
    		if(flag==k) break;
    		newStr = newStr.substring(0,newStr.length()-1);
    		flag++;
    	}
    	while(newStr.length()!=0&&newStr.charAt(0)=='0') {
    		newStr = newStr.substring(1,newStr.length());
    	}
    	return newStr.length()==0 ? newStr+"0":newStr;
    }
    
    public String removeKdigits1(String num, int k) {
        int digit = num.length()-k;
        char[] stack = new char[num.length()];
        int top = 0;
    
        for(int i = 0; i < num.length();i++ ){
            char c = num.charAt(i);
            while(top > 0 && stack[top-1]>c && k>0){
                top--;
                k--;
            }
            stack[top++] = c;
        }
        
        int index = 0;
        while(index < digit && stack[index] == '0'){
            index++;
        }      
        return index == digit ? "0" : new String(stack,index,digit-index);
    }
    
    public String removeKdigits2(String num, int k ) {
    	if(num==null||num.length()==0) {
    		return "0";
    	}
    	if(num.length()<k) {
    		return "0";
    	}
    	int len =  num.length()-k;
    	char[] stack = new char[num.length()];
    	int top=0;
    	for(int i = 0;i<num.length();i++) {
    		char temp = num.charAt(i);
    		while(top>0&&stack[top-1]>temp&&k>0) {
    			top--;
    			k--;
    		}
    		stack[top++]=temp;
    	}
    	int index = 0;
    	while(index<len&&stack[index]=='0') {
    		index++;
    	}
    	return index==len? "0":new String(stack,index,len-index);
    }  
}

public class LeedCode402 {
	public static void main(String[] args) {
		Solution5 solution = new Solution5();
		System.out.println(solution.removeKdigits2("11", 2));
	}
}
