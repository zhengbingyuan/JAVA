package cn.iteast_14;
//�����ҵ�ѧ����
class Student1{
	//�������
	String name;
	int age;
	String address;
	
	//���巽��
	//ѧϰ�ķ���
	public void study(){
		System.out.println("ѧ����ѧϰ");
	}
	
	//�Է��ķ���
	public void eat(){
		System.out.println("ѧϰ���ˣ�Ҫ�Է�");
	}
	
	//˯���ķ���
	public void sleep(){
		System.out.println("ѧϰ���ˣ�Ҫ˯��");
	}
}
public class StudentDemo{
	public static void main(String[] args){
		//����  ������ = new ����������
		Student1 s = new Student1();
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.name = "֣��ԭ";
		s.age = 23;
		s.address = "����";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.study();
		s.eat();
		s.sleep();
	}
}
