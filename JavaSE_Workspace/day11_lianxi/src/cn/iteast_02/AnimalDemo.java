package cn.iteast_02;

import cm.liuyi_02.Animal;
import cm.liuyi_02.Cat;
import cm.liuyi_02.Dog;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		System.out.println("-----------");
		a = new Dog();
		a.eat();
		a.sleep();
		System.out.println("------------");
		Dog d = (Dog)a;
		d.eat();
		d.sleep();
		d.jump();
		
	}
}
