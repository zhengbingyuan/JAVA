package cn.itcast_03;
/*
 * public boolean equals(Object obj)��ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 *		   public boolean equals(Object obj) {
        		return (this == obj);
    		}
   		���������Ĭ������±Ƚϵ��ǵ�ֵַ��
 * ע��==��
 * 		�������ͣ��Ƚϵľ���ֵ�Ƿ����
 * 		�������ͣ��Ƚϵľ��ǵ�ֵַ�Ƿ����
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("֣��ԭ",23);
		Student s2 = new Student("֣��ԭ",23);
		System.out.println(s1==s2);//false
		Student s3 = s1;
		System.out.println(s1==s3);//true
		System.out.println("-------------------");
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s1));//true
		System.out.println(s1.equals(s3));//true
		Student s4 = new Student("���",20);
		System.out.println(s1.equals(s4));
		
		Demo d = new Demo();
		System.out.println(s1.equals(d));
				
	}
}

class Demo{
	
}
