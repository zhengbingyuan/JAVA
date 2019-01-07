package cn.itcast_04;
/*
 * 替换功能
 * 		String类的public String repiaceAll(String regex,String replacement)
 * 		使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s = "hello12345worldkh6221123456789java";
		//去除所有的数字
		//String regex = "\\d+";
		String regex = "\\d";
		String ss = "*";
		String result = s.replaceAll(regex, ss);
		System.out.println("result:"+result);
	}
}
