package com.libuguan.ex02;

public class ex05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		boolean leap;
		int year = 2018;
		boolean judge = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if(judge) {
			System.out.println(year + "年是闰年");
		}else {
			System.out.println(year + "年不是闰年");
		}

	}

}
