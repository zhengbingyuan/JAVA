package cn.itcast_03;

import java.util.Scanner;

/*
 * ���ǲ�����С��Ϸ
 */
public class GuessNumberGame {
	private  GuessNumberGame(){
		
	}
	
	public static void start(){
		int number = (int)( Math.random()*100)+1;
		while(true){	
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�µ�����(1-100)��");
		int guessNumber = sc.nextInt();
		if(guessNumber>number){
			System.out.println("��µ�����"+guessNumber+"����");
		}else if(guessNumber<number){
			System.out.println("��µ�����"+guessNumber+"С��");
		}else{
			System.out.println("��¶���");
			break;
		}
		}
	}
	
}
