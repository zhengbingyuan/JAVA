package cm.liuyi_02;

import cm.liuyi_01.Jump;
/**
 * 这是具体的狗类
 * @author 郑冰原
 * @version V1.0
 */
public class Dog extends Animal implements Jump {

	public void jump() {
		// TODO Auto-generated method stub
			System.out.println("会跳高的狗");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃肉");
	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗站着睡觉");
	}

}
