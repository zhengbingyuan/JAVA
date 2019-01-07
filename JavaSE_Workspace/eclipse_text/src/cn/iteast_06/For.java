package cn.iteast_06;

public class For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=9;i++){
			System.out.println("HelloWorld");
		}
		for (int a=1;a<=10;a++){
			System.out.println(a);
		}*/
		int sum=0;
		for (int a=1;a<=100;a++){
			sum=sum+a;
		}
		System.out.println("1-100的和："+sum);
		
		int sum1=0;
		for (int a=1;a<=100;a++){
			if((a%2)==0)
			sum1=sum1+a;
		}
		System.out.println("1-100的偶数和："+sum1);
		
		int sum3=0;
		for (int a=1;a<=100;a+=2){
			
			sum3=sum3+a;
		}
		System.out.println("1-100的奇数和："+sum3);
		
		int sum4=1;
		for (int a=1;a<=5;a++){
			
			sum4=sum4*a;
		}
		System.out.println("1-5的连乘："+sum4);
		
		int end=884800,count=0;
		for (int start=1;start<=end;start *=2){
			count++;
		}
		System.out.println("次数："+count);
	}

}
