package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection:����
 * ��All����
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		//���һ������Ԫ��
		//System.out.println("addAll:"+c1.addAll(c2));
		
		//�Ƴ�����Ԫ�أ�ֻҪ��һ�����Ƴ��˾ͷ���ture
		//System.out.println("removeAll:"+c1.removeAll(c2));
		
		//�ж��Ƿ����һ������Ԫ��,����ȫ������Ԫ�زŷ���ture
		//System.out.println("contains:"+c1.containsAll(c2));
		
		//������������Ԫ�صĽ�����A.retainAll(B)����洢��A��
		//����ֵ��ʾ��A�Ƿ������ı䡣�ı�Ϊture�����ı�Ϊfalse
		System.out.println("retainAll:"+c1.retainAll(c2));
		
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		
	}
}
