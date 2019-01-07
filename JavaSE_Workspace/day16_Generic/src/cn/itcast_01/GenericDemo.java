package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�ַ���������
 * 
  *  ���ǰ���������д����д���򣬽��������
  *  Ϊʲô�أ�
 * 		��Ϊ���ǿ�ʼ�洢��ʱ�򣬴洢��String��Integer�������͵����ݡ�
 * 		���ڱ�����ʱ�����ǰ����ǵ���String���ʹ����ģ����Ծͱ����ˣ�
  *  �����أ� ���ڱ����ڼ�ȴû�и������ǡ�
  *  ���ԣ��Ҿ��������ƵĲ��á�
  *  ����һ�£����ǵ����ݣ�
  *  String[] strArray = new String[3];
  *  strArray[0] = "hello";
  *  strArray[1] = 10;
  *  ����Ҳģ��������������������ڴ��������ʱ����ȷԪ�ص��������͡������Ͳ����������ˡ�
  *  �����ּ�������Ϊ�����͡�
 *  
  *  ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������͡����������ͣ������͵�����һ�����ݡ�
  *  ��ʽ��
 *  	<��������>
  *  	�˴�����������ֻ���������������͡�
  *  �ô���
  * 	 A��������ʱ�ڵ������ᵽ�˱����ڼ�
  *  	 B:������ǿ������ת��
  *  	 C:�Ż��˳�����ƣ�����˻�ɫ������
 */
public class GenericDemo {
	public static void main(String[] args) {
		//����
		ArrayList<String> array = new ArrayList<>();
		
		//����
		array.add("hello");
		array.add("world");
		array.add("java");
		//array.add(new Integer(100));
		//array.add(100); //JDK5�Ժ��Զ�װ��
		//�ȼ���array.add(Integer.valueOf(10));
		
		//����
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			// ClassCastException
			String s = it.next();
			System.out.println(s);
		}
	}
}