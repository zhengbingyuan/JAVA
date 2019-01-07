package cn.itcast_03;
/*
 * StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index);删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end);删除从指定位置开始指定位置结束的内容，并返回本身
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		
		//sb.deleteCharAt(1);
		//删除第一个l字符
		//sb.deleteCharAt(1);
		//sb.delete(5,10);//删除world，包左不包右
		sb.delete(0, sb.length());//删除所有数据
		System.out.println("sb:"+sb);
		System.out.println("-------------");
	}
}
