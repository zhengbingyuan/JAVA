package cn.iteast_16;
class Student{
	//��private���εĳ�Ա�ͷ���ֻ���ڱ����з��� 
	private String name;
	private int age;
//thisָ��ǰ��Ķ�������	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age<0 || age>120)
			System.out.println("�������䲻�Ϸ���");
		else 
			this.age = age;
	}
	public void show(){
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
	}
}
public class PrivateDemo {
	public static void main(String[] args){
		Student s = new Student();
		s.setName("֣��ԭ");
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
