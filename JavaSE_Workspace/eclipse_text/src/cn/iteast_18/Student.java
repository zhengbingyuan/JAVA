package cn.iteast_18;
/*
 * 提高开发效率
 * A：帮助我们自动提供构造方法
 * 		构造方法 ：右键 Source 
 * B：
 */
class Student1{
	private String name;
	private int age;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
public class Student {
	public static void main(String[] args) {
		System.out.println();
	}
}
