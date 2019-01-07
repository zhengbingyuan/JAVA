package LeedCode;
/**
  * ����һ�����ַ�����ʾ�ķǸ����� num���Ƴ�������е� k λ���֣�ʹ��ʣ�µ�������С��
  * ɾ��������k�����֣����ɾ�������Сֵ
 * @param num  ԭ����
 * @param k  ɾ������
 * 
  * ����: "1432219"
 *  	3
  * ���: "1219"
  * ����: �Ƴ����������� 4, 3, �� 2 �γ�һ���µ���С������ 1219��
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
