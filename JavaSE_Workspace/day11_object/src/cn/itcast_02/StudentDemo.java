package cn.itcast_02;
/*
 * public String toString():返回该对象的字符串表示。
 * 			它的值等于： getClass().getName() + '@' + Integer.toHexString(hashCode())
 * 一般要重写toString方法，自动生成。
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------");
		System.out.println(s.toString());
	}
}
