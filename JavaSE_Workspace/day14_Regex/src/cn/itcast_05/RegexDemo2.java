package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能:获取下面这个字符串中的三个字符组成的单词
 * 	da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		//规则
		String regex = "\\b\\w{3}\\b";
		
		//把规则编译成模式对象
		Pattern p = Pattern.compile(regex);
		//通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);
		//调用匹配器对象的功能
		//public boolean find();
		/*boolean flag = m.find();
		System.out.println(flag);*/
		//如何得到值
		//public String group()
		/*String ss = m.group();
		System.out.println(ss);*/
		while(m.find()){
			System.out.println(m.group());
		}
		
	}
}
