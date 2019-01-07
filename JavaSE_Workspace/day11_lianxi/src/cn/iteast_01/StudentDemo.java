package cn.iteast_01;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Ö£±ùÔ­");
		s1.setAge(23);
		System.out.println(s1.getName()+"-----"+s1.getAge());
		s1.show();
		
		Student s2 = new Student("Ìì²Å",20);
		System.out.println(s2.getName()+"-----"+s2.getAge());
		s2.show();
	}
}
