package cn.itcast_03;

import java.util.Scanner;

/*
 * 这是猜数字小游戏
 */
public class GuessNumberGame {
	private  GuessNumberGame(){
		
	}
	
	public static void start(){
		int number = (int)( Math.random()*100)+1;
		while(true){	
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要猜的数据(1-100)：");
		int guessNumber = sc.nextInt();
		if(guessNumber>number){
			System.out.println("你猜的数据"+guessNumber+"大了");
		}else if(guessNumber<number){
			System.out.println("你猜的数据"+guessNumber+"小了");
		}else{
			System.out.println("你猜对了");
			break;
		}
		}
	}
	
}
