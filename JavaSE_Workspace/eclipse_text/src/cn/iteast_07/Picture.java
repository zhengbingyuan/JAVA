package cn.iteast_07;

public class Picture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++)
				System.out.print('*');
			System.out.println();
			}
		
		int daycount;
		double daysum=0;
		for( daycount=0;daysum<=100;daycount++){
			daysum+=2.5;
			if(daycount%5==0 && daycount>0) daysum-=6;
		}
		System.out.println("µÚ"+daycount+"Ìì´æ100Ôª");
	}

}
