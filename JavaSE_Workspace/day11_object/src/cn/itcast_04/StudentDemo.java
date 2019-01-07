package cn.itcast_04;
/*
 * protected void finalize():当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
 * protected Object clone():创建并返回此对象的一个副本.
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student();
		s.setName("郑冰原");
		s.setAge(23);
		
		Object obj = s.clone();
		Student s2 = (Student)obj;
		
		System.out.println(s.getName()+"--------"+s.getAge());
		System.out.println(s2.getName()+"-------"+s2.getAge());
	}
}


