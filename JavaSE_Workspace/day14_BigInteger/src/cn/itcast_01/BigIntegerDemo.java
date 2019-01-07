package cn.itcast_01;

import java.math.BigInteger;

/*
 * BigInteger类
 * 构造方法：
 * public BigInteger(String val)
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		BigInteger bi = new BigInteger("2147483648");
		System.out.println(bi);
	}
}
