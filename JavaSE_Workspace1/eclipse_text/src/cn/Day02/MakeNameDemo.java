/*
 * 标识符：就是给类，接口，方法，变量等起名字。
 * 组成规则：
 * 		A：英文字母大小写
 * 		B：数字字符
 * 		C:$和_
 * 注意事项：
 * 		A：不能以数字开头
 * 		B:不能是Java语言中的关键字
 * 		C：Java语言严格区分大小写
 * 常见的命名规则：见明知意
 * 		举例：我要定义一个学生类
 * 					class Student{}
 * 					class S{}
 * 		包：其实就是文件夹，用于把相同的类名进行区分
 * 			全部小写
 * 			单级：liuyi
 * 			多级：cn.itcast
 * 		类或者接口：
 * 			一个单词：单词的首字母必须大写
 * 				举例：Student,Dog
 * 			多个单词：每个单词的首字母必须大写
 * 				举例：HelloWorld,StudentName
 * 		方法或变量：
 * 			一个单词：单词的首字母小写
 * 				举例：main，age
 * 			多个单词：从第二个开始，每个单词的首字母大写
 * 				举例：studentAge,showAllName
 * 		常量：
 * 			一个单词：全部大写
 * 				举例：PI
 * 			多个单词：每个字母都大写，用_隔开
 * 				举例：STUDENT_MAX_AGE
 */
package cn.Day02;
public class MakeNameDemo {
	public static void main(String[] args){
		//这是正确的
		int x = 100;
		
		//int 1y = 100;这是错误的，变量名不能以数字开头
		int y1 = 100;
		
		//int public = 100;这是错误的，变量名不能是关键字
		int Public = 100;
		
		System.out.println("x:"+x+",y1:"+y1+",Public:"+Public);
		
	}

}
