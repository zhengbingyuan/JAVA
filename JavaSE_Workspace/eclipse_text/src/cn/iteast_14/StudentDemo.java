package cn.iteast_14;
//这是我的学生类
class Student1{
	//定义变量
	String name;
	int age;
	String address;
	
	//定义方法
	//学习的方法
	public void study(){
		System.out.println("学生爱学习");
	}
	
	//吃饭的方法
	public void eat(){
		System.out.println("学习饿了，要吃饭");
	}
	
	//睡觉的方法
	public void sleep(){
		System.out.println("学习累了，要睡觉");
	}
}
public class StudentDemo{
	public static void main(String[] args){
		//类名  对象名 = new 类名（）；
		Student1 s = new Student1();
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.name = "郑冰原";
		s.age = 23;
		s.address = "河南";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.study();
		s.eat();
		s.sleep();
	}
}
