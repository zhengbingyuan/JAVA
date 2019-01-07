package cn.itcast_03;
/*
 * public boolean equals(Object obj)：指示其他某个对象是否与此对象“相等”。 
 *		   public boolean equals(Object obj) {
        		return (this == obj);
    		}
   		这个方法，默认情况下比较的是地址值。
 * 注意==：
 * 		基本类型：比较的就是值是否相等
 * 		引用类型：比较的就是地址值是否相等
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("郑冰原",23);
		Student s2 = new Student("郑冰原",23);
		System.out.println(s1==s2);//false
		Student s3 = s1;
		System.out.println(s1==s3);//true
		System.out.println("-------------------");
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s1));//true
		System.out.println(s1.equals(s3));//true
		Student s4 = new Student("天才",20);
		System.out.println(s1.equals(s4));
		
		Demo d = new Demo();
		System.out.println(s1.equals(d));
				
	}
}

class Demo{
	
}
