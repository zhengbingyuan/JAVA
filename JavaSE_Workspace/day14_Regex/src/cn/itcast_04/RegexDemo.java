package cn.itcast_04;
/*
 * �滻����
 * 		String���public String repiaceAll(String regex,String replacement)
 * 		ʹ�ø�����replacement�滻���ַ�������ƥ�������������ʽ�����ַ���
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s = "hello12345worldkh6221123456789java";
		//ȥ�����е�����
		//String regex = "\\d+";
		String regex = "\\d";
		String ss = "*";
		String result = s.replaceAll(regex, ss);
		System.out.println("result:"+result);
	}
}
