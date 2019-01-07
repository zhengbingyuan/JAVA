package cn.itcast_01;
/*
 * System类包含一些有用的类字段和方法，它不能被实例化。
 * 方法：
 * 		public static void gc();运行垃圾回收器
 * 		public static void exit(int status);
 * 		public static long currentTimeMillis();
 * 		public static void arraycopy(object src,int srcPos,object dest,int destPot,int length);
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("郑冰原",23);
		System.out.println(p);
		p = null;
		System.gc();
	}
}
