package cn.iteast_17;
import java.util.Scanner;
class ChangFangXing{
	private int length;
	private int width;
	
	public ChangFangXing(){
		
	}
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	
	public int getZhouchang(){
		return (length+width)*2;
	}
	public int getArea(){
		return length*width;
	}
}
public class ChangfangxingDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ChangFangXing c = new ChangFangXing();
		System.out.println("�����볤���εĳ���");
		c.setLength(sc.nextInt());
		System.out.println("�����볤���εĿ�");
		c.setWidth(sc.nextInt());
		System.out.println(c.getZhouchang()+"----"+c.getArea());
	}
}
