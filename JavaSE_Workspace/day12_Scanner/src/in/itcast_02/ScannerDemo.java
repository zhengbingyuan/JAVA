package in.itcast_02;
/*
 * ������ʽ��
 * 		public boolean hasNextInt();�ж��Ƿ���ĳ�����͵�Ԫ��
 * 		public int nextInt();��ȡ��Ԫ��
 * ���õ���������
 * 		public int nextInt();��ȡһ��int���͵�ֵ
 * 		public String nextLine();��ȡһ��String���͵�ֵ
 * 
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			System.out.println("������һ�����ݣ�");
			int x = sc.nextInt();
			System.out.println("x:"+x);
		} else {
			System.out.println("���������������");
		}	
		
		//�Ȼ�ȡһ��intֵ���ڻ�ȡһ���ַ���
		//��������⣻s1û�����ݣ��ò�ͬ�Ķ������
		int a = sc.nextInt();
		String s1 = sc.nextLine();
		System.out.println("a:"+a+"  s1:"+s1);
		
	}
}
