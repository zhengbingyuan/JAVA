package cn.itcast_01;

import java.util.Random;

/*
 * Random���������������
 * ���췽����
 * 		public Random():û�и����ӣ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 * 		public Random(long seed)������ָ������
 * ��Ա������
 * 		public int nextInt():����int��Χ�ڵ������
 * 		public int nextInt(int n):���ص���[0,n)��Χ�������
 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		//��������
		//Random r = new Random();
		Random r = new Random(1111);
		
		for(int x=0;x<10;x++){
			//int num = r.nextInt();
			int num = r.nextInt(100)+1;
			System.out.println(num);
		}
	}
}
