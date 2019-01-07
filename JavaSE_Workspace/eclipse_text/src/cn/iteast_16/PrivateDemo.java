package cn.iteast_16;
class Student{
	//被private修饰的成员和方法只能在本类中访问 
	private String name;
	private int age;
//this指当前类的对象引用	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age<0 || age>120)
			System.out.println("输入年龄不合法：");
		else 
			this.age = age;
	}
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
}
public class PrivateDemo {
	public static void main(String[] args){
		Student s = new Student();
		s.setName("郑冰原");
		s.setAge(23);
		s.show();
		int[] a = new int[4];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3]=44;
		String str="";
		for(int x=0;x<a.length;x++){
			str+=a[x];
		}
		str =str+1;
		System.out.println(str);
				
	}
}
