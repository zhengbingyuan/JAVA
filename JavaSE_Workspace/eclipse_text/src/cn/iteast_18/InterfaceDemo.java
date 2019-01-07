
/*
 * 接口的特点：
 * 		A：接口用关键字interface表示
 * 			interface 接口名 {}
 * 		B：类实现接口用implements表示
 * 			class 类名  implements 接口名 {}
 * 		C：接口不能实例化
 * 			按照多态的方法来实现实例化。
 * 		D：接口的子类
 * 			a：可以是抽象类。但意义不大。
 * 			b:可以是具体类。要重写接口中的所有抽象方法。（推荐）
 */
package cn.iteast_18;

//定义动物训练接口
interface AnimalTrain{
	public abstract void jump();
}

//抽象类实现接口
//注意：开发中，接口名+Impl这种格式是接口的实现类格式
class Dog implements AnimalTrain{
	public void jump(){
		System.out.println("猫可以跳高了");
	}
}
public class InterfaceDemo {
	public static void main(String[] args){
		AnimalTrain at = new Dog();
		at.jump();
	}
}
