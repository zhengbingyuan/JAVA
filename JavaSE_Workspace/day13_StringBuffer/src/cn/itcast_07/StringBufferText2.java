package cn.itcast_07;
/*
 * 把数组拼接成一个字符串
 */
public class StringBufferText2 {
	public static void main(String[] args) {
		int[] arr = {44,33,22,11,22};
		String s1 = arrayToString(arr);
		System.out.println("s1:"+s1);
		
		String s2 = arrayToString2(arr);
		System.out.println("s2:"+s2);
	}
	
	//优化
	public static String arrayToString2(int[] arr){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int x = 0;x<arr.length;x++){
			if(x==arr.length-1){
				sb.append(arr[x]);
				
			}else {
				sb.append(arr[x]).append(",");
				
			}
		}
		sb.append("]");
		return sb.toString();
	}
	public static String arrayToString(int[] arr){
		String s ="";
		s +="[";
		for(int x = 0;x<arr.length;x++){
			if(x==arr.length-1){
				s+=arr[x];
				s+="]";
			}else {
				s+=arr[x];
				s+=",";
			}
		}
		return s;
	}
}
