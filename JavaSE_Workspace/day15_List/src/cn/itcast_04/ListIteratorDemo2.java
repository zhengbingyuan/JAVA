package cn.itcast_04;
/*
 * �жϼ�������û��world������о����һ��"javaee"Ԫ��
 * ����ͨ�õ�����iterator���������ִ���ԭ��
 * 		�������������ڼ��϶����ڵģ����жϳɹ��󣬼��ϵ��������Ԫ�أ�
 * 		��������ȴ��֪�������Ծͱ����������в����޸��쳣
 * 		��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�ص�
 * ��ν���أ�
 * 		A:����������Ԫ�أ��������޸�Ԫ��
 * 			Ԫ���Ǹ��ڸղŵ�����Ԫ�صĺ���ġ�
 * 		B:���ϱ���Ԫ�أ������޸�Ԫ�أ���ͨfor��
 * 			Ԫ������������
 * 		
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//����List���϶���
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//����������
		//�˷����Ǵ���ģ���Ϊ���ϸı䣬������û��
	/*	Iterator it = list.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if("world".equals(s)){
				list.add("javaee");
			}	
		}*/
		
		//�Ľ�������һ ����������
	/*	ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s= (String)lit.next();
			if("world".equals(s)){
				lit.add("javaee");
			}
		}*/
		
		//������ ���ϱ���
		for(int x =0;x<list.size();x++){
			String s= (String)list.get(x);
			if("world".equals(s)){
				list.add("javaee");	
			}
		}
		System.out.println("list:"+list);
	}
}
