package cn.itcast_02;
/*
 * StringBuffer����ӹ���
 * Public StringBuffer append(String str);���԰���������������ӵ��ַ������������������ַ�������������
 * 
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		StringBuffer sb2 = sb.append("hello");
//		System.out.println("sb:"+sb);
//		System.out.println("sb2:"+sb2);
//		System.out.println(sb==sb2);
		
		sb.append("hello");
		sb.append(true);
		sb.append(12);
		sb.append(13.14);
		sb.insert(5,"word");
		//sb.append(true);
		System.out.println("sb:"+sb);
		
	}
}
