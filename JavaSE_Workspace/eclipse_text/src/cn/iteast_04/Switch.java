package cn.iteast_04;
import java.util.Scanner;
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����ļ���������ϲ��˭��");
		System.out.println("65 ֣��ԭ");
		System.out.println("66 ����");
		System.out.println("67 ����");
		System.out.println("68 ��E");
		
		System.out.println("���������ѡ��");
		int choicenumber=sc.nextInt();
		
		char choice = (char) choicenumber;
		
		switch(choice){
		case 'A':
			System.out.println("��ϲ�㣬ѡ����");
			break;
		case 'B':
			System.out.println("������ʶ��ѡ������");
			break;
		case 'C':
			System.out.println("������ʶ��ѡ������");
			break;
		case 'D':
			System.out.println("������ʶ��ѡ������");
			break;
		default:
			System.out.println("û�и�ѡ��");
			break;
		}
	}

}
