package cn.itcast_01;
/*
 * Collection������
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		
		//�������϶���
		Collection c = new ArrayList();
		
		//System.out.println("add:"+c.add("hello"));
		//�������
		c.add("hello");
		c.add("world");
		c.add("java");
		//���
		//c.clear();
		
		//�����Ƴ�
		//System.out.println("remove:"+c.remove("hello"));
		//System.out.println("remove:"+c.remove("javaee"));
		
		//�ж��Ƿ����
		//System.out.println("contains:"+c.contains("hello"));
		
		//�ж��Ƿ�Ϊ��
		//System.out.println("isEmpty:"+c.isEmpty());
		
		//����
		System.out.println("size:"+c.size());
		System.out.println("c:"+c);
		
	}
}
