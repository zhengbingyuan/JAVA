package cn.itcast_07;
/*
 * String�� StringBuffer�Ļ���ת��
 * 
 */
public class StringBufferText {
	public static void main(String[] args) {
		String s = "hello";
		//���ù��췽�����԰�StringתΪStringBuffer
		StringBuffer sb = new StringBuffer(s);
		//����
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:"+sb);
		System.out.println("sb2:"+sb2);
		
		StringBuffer buffer = new StringBuffer("java");
		//ͨ������ת
		String str =new String(buffer);
		//ͨ��toString��������ת
		String str2 =buffer.toString();
		System.out.println("str:"+str);
		System.out.println("str2:"+str2);
	}
}
