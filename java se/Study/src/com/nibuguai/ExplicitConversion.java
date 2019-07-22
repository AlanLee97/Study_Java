package com.nibuguai;

public class ExplicitConversion {

	public static void main(String[] args) {
		int a = (int) 45.32;
		long b = (long) 456.6f;
		char c = (char) 97.14;
		System.out.println("45.23强制转换成int的结果为："+a);
		System.out.println("456.6f强制转换成int的结果为："+b);
		System.out.println("97.14强制转换成int的结果为："+c);

	}

}
