
/*
 * �ӿڵ��ص㣺
 * 		A���ӿ��ùؼ���interface��ʾ
 * 			interface �ӿ��� {}
 * 		B����ʵ�ֽӿ���implements��ʾ
 * 			class ����  implements �ӿ��� {}
 * 		C���ӿڲ���ʵ����
 * 			���ն�̬�ķ�����ʵ��ʵ������
 * 		D���ӿڵ�����
 * 			a�������ǳ����ࡣ�����岻��
 * 			b:�����Ǿ����ࡣҪ��д�ӿ��е����г��󷽷������Ƽ���
 */
package cn.iteast_18;

//���嶯��ѵ���ӿ�
interface AnimalTrain{
	public abstract void jump();
}

//������ʵ�ֽӿ�
//ע�⣺�����У��ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�����ʽ
class Dog implements AnimalTrain{
	public void jump(){
		System.out.println("è����������");
	}
}
public class InterfaceDemo {
	public static void main(String[] args){
		AnimalTrain at = new Dog();
		at.jump();
	}
}
