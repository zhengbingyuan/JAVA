package cn.iteast_15;
//形式参数   引用类型 （类  类型）
class Student{
	public void show(){
		System.out.println("我爱学习");
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
