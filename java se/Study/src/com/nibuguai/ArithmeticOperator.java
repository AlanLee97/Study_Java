package com.nibuguai;

import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������֣��ÿո������num1 num2��:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("num1+num2�ĺ�Ϊ��" + (num1+num2));
		System.out.println("num1-num2�Ĳ�Ϊ��" + (num1-num2));
		System.out.println("num1*num2�Ļ�Ϊ��" + (num1*num2));
		System.out.println("num1/num2����Ϊ��" + (num1/num2));
		System.out.println("num1%num2������Ϊ��" + (num1%num2));

	}

}
