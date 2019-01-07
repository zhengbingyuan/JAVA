package cn.itcast_01;
/*
 * Integer的构造方法
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a=100;
		Integer ss = new Integer(a);
		System.out.println("ss:"+ss);
		
		String s = "100";
		Integer iii = new Integer(s);
		System.out.println("iii:"+iii);
	}
}
