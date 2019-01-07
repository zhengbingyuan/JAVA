package text;

public class Test2 {
	public static void main(String[] args) {

		int i1=1;
		
		System.out.println(getType(i1));
		Integer i2=1;
		System.out.println(getType(i2));
		Integer i3=new Integer(1);
	
		Integer i4 = Integer.valueOf(1);
		Integer i5= Integer.valueOf(1);
	
		System.out.println(i1==i2);
		System.out.println(i2==i3);
		System.out.println(i2==i4);
		System.out.println(i3==i4);
		System.out.println(i4==i5);
		System.out.println(getType(i1));
		System.out.println(getType(i2));
		System.out.println(getType(i4));
		
	
		String s1=new String("");
		String s2="";
		String s3="";
		String s4=String.valueOf("");
		String s5=String.valueOf("");
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s4==s5);
		
		System.out.println("------------");
		Integer is = 5;
		System.out.println(is.toString());
	
	
}
	
static String getType(Object o){ //获取变量类型方法
	return o.getClass().toString(); //使用int类型的getClass()方法
	} 
}
