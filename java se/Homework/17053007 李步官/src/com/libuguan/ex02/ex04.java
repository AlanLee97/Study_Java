package com.libuguan.ex02;

public class ex04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a = 25 , b = 20, e = 3, f =0;
		boolean d = a < b;
		System.out.println("a = 25, b = 20, e = 3, f = 0");
		System.out.println("因为关系表达式 a < b 为假：" + d);
		if(e != 0 && a / e >5) {
			System.out.println("因为e非0且a/e为8大于5，所以输出a/e = " + a/e);
		}
		if(f != 0 && a/f > 5) {
			System.out.println("a/f=" + a/f);
		}else {
			System.out.println("因为f 值为0，所以输出f =" + f);
		}

	}

}
