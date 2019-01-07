package cn.itcast_01;

import java.math.BigDecimal;

/*
 * Bigdecimal:类
 * 		可以解决精度丢失问题
 * 方法：
 * 		public BigDecimal add(BigDecimal augend)加
 * 		public BigDecimal subtract(BigDecimal subtrahend);减
 *		public BigDecimal multiply(BigDecimal multiplicand);乘
 *		public BigDecimal divide(BigDecimal divisor);除
 *		public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode);
 *				商，几位小数，如何舍取
 */
public class BigDecimalDemo {
		public static void main(String[] args) {
			BigDecimal bd1 = new BigDecimal("0.09");
			BigDecimal bd2 = new BigDecimal("0.01");
			System.out.println("add:"+bd1.add(bd2));
			
			BigDecimal bd3 = new BigDecimal("1.0");
			BigDecimal bd4 = new BigDecimal("0.32");
			System.out.println("subtract:"+bd3.subtract(bd4));
			
			BigDecimal bd5 = new BigDecimal("1.01");
			BigDecimal bd6 = new BigDecimal("100");
			System.out.println("multiply:"+bd5.multiply(bd6));
			
			BigDecimal bd7 = new BigDecimal("1.301");
			BigDecimal bd8 = new BigDecimal("100");
			System.out.println("divide:"+bd7.divide(bd8));
			System.out.println("divide:"+bd7.divide(bd8,3,BigDecimal.ROUND_HALF_UP));
			System.out.println("divide:"+bd7.divide(bd8,8,BigDecimal.ROUND_HALF_UP));
		}
}
