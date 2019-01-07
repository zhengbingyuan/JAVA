package cn.itcast_04;
/*
 * 需求：统计一个字符串中大写字母字符，小写字母字符，和数字的个数
 * 
 */
public class StringText {
	public static void main(String[] args) {
		String s = "Hello123World";
		
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		for(int x=0;x<s.length();x++){
			char ch = s.charAt(x);
			if(ch>='a' && ch<='z'){
				smallCount++;
			}else if(ch>='A' && ch<='Z'){
				bigCount++;
			}else if(ch>='0' && ch<='9'){
				numberCount++;
			}
		}
		System.out.println("大写字母"+bigCount+"  小写字母"+smallCount+"  数字"+numberCount);
	}
}
