package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����:��ȡ��������ַ����е������ַ���ɵĵ���
 * 	da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		//����
		String regex = "\\b\\w{3}\\b";
		
		//�ѹ�������ģʽ����
		Pattern p = Pattern.compile(regex);
		//ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);
		//����ƥ��������Ĺ���
		//public boolean find();
		/*boolean flag = m.find();
		System.out.println(flag);*/
		//��εõ�ֵ
		//public String group()
		/*String ss = m.group();
		System.out.println(ss);*/
		while(m.find()){
			System.out.println(m.group());
		}
		
	}
}
