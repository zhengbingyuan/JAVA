package cn.itcast_04;
/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ֵĸ���
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
		System.out.println("��д��ĸ"+bigCount+"  Сд��ĸ"+smallCount+"  ����"+numberCount);
	}
}
