package cn.itcast_04;
/*
 * protected void finalize():������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷�����
 * protected Object clone():���������ش˶����һ������.
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student();
		s.setName("֣��ԭ");
		s.setAge(23);
		
		Object obj = s.clone();
		Student s2 = (Student)obj;
		
		System.out.println(s.getName()+"--------"+s.getAge());
		System.out.println(s2.getName()+"-------"+s2.getAge());
	}
}


