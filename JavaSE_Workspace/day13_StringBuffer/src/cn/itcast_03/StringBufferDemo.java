package cn.itcast_03;
/*
 * StringBuffer��ɾ������
 * public StringBuffer deleteCharAt(int index);ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delete(int start,int end);ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		
		//sb.deleteCharAt(1);
		//ɾ����һ��l�ַ�
		//sb.deleteCharAt(1);
		//sb.delete(5,10);//ɾ��world�����󲻰���
		sb.delete(0, sb.length());//ɾ����������
		System.out.println("sb:"+sb);
		System.out.println("-------------");
	}
}
