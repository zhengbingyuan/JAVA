package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵı���
 * 		size()��get()�������ʹ��
 *  
 */
public class ListDemo2 {
	public static void main(String[] args) {
		//��������
		List list = new ArrayList();
		
		//���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//��������
		for(int x = 0;x<list.size();x++){
			String s = (String)list.get(x);
			System.out.println(s);
		}
	}
}
