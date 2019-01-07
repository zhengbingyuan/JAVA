package cn.itcast_03;
/*
 * int类型和String类型的相互转换
 * int-----String
 * String------int
 * 
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int number=100;
		//方式1
		String s1 =""+number;
		System.out.println("s1:"+s1);
		//方式2
		String s2 = String.valueOf(number);
		System.out.println("s2:"+s2);
		
		Integer i = new Integer(100);
		String s3 = i.toString();
		System.out.println("s3:"+s3);
		
		String s4 = Integer.toString(number);
		System.out.println("s4:"+s4);
		
		//String ---int
		String s = "100";
		Integer ii = new Integer(s);
		int x = ii.intValue();
		System.out.println("x:"+x);
		
		int y = Integer.parseInt(s);
		System.out.println("y:"+y);
	}
}
