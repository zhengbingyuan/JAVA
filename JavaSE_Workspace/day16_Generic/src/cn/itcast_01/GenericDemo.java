package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储字符串并遍历
 * 
  *  我们按照正常的写法来写程序，结果出错了
  *  为什么呢？
 * 		因为我们开始存储的时候，存储了String和Integer两种类型的数据。
 * 		而在遍历的时候，我们把他们当做String类型处理的，所以就报错了，
  *  但是呢， 他在编译期间却没有告诉我们。
  *  所以，我觉的这个设计的不好。
  *  回想一下，我们的数据：
  *  String[] strArray = new String[3];
  *  strArray[0] = "hello";
  *  strArray[1] = 10;
  *  集合也模仿着数组的这种做法，在创建对象的时候明确元素的数据类型。这样就不会有问题了。
  *  而这种技术被称为：泛型。
 *  
  *  泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。参数化类型，把类型当参数一样传递。
  *  格式：
 *  	<数据类型>
  *  	此处的数据类型只能是引用数据类型。
  *  好处：
  * 	 A：把运行时期的问题提到了编译期间
  *  	 B:避免了强制类型转换
  *  	 C:优化了程序设计，解决了黄色警告线
 */
public class GenericDemo {
	public static void main(String[] args) {
		//创建
		ArrayList<String> array = new ArrayList<>();
		
		//添加
		array.add("hello");
		array.add("world");
		array.add("java");
		//array.add(new Integer(100));
		//array.add(100); //JDK5以后自动装箱
		//等价于array.add(Integer.valueOf(10));
		
		//遍历
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			// ClassCastException
			String s = it.next();
			System.out.println(s);
		}
	}
}
