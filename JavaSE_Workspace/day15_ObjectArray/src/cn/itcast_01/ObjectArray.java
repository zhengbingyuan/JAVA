package cn.itcast_01;

public class ObjectArray {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		Student s1 = new Student("����",30);
		Student s2 = new Student("����",31);
		Student s3 = new Student("����",32);
		Student s4 = new Student("�ų�",33);
		Student s5 = new Student("�ѿ�",34);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		for(int x=0;x<students.length;x++){
			System.out.println(students[x]);
			Student s = students[x];
			System.out.println(s.getAge()+"---------"+s.getName());
		}
	}
}
