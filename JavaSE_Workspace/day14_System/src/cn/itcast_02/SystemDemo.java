package cn.itcast_02;
/*
 * System类包含一些有用的类字段和方法，它不能被实例化。
 * 方法：
 * 		public static void gc();运行垃圾回收器
 * 		public static void exit(int status);终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止
 * 		public static long currentTimeMillis();返回以毫秒为单位的当前时间
 * 		public static void arraycopy(object src,int srcPos,object dest,int destPot,int length);
 */
public class SystemDemo {
	public static void main(String[] args) {
//		System.out.println("天才");
//		System.exit(0);
//		System.out.println("congming");
		System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		for(int x = 0;x<100000;x++){
			System.out.println("hello"+x);
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时"+(end-start)+"毫秒");
	}
}
