package cn.iteast_15;
//��ʽ����   �������� ����  ���ͣ�
class Student{
	public void show(){
		System.out.println("�Ұ�ѧϰ");
	}
}
class StudentDemo{
	public void method(Student s){
		s.show();
	}
}
public class ArgsTest {
	public static void main(String[] args){
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}
