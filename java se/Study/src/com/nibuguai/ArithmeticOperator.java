package com.nibuguai;

import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数字，用空格隔开（num1 num2）:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("num1+num2的和为：" + (num1+num2));
		System.out.println("num1-num2的差为：" + (num1-num2));
		System.out.println("num1*num2的积为：" + (num1*num2));
		System.out.println("num1/num2的商为：" + (num1/num2));
		System.out.println("num1%num2的余数为：" + (num1%num2));

	}

}
