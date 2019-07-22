package com.Homework;
import java.util.Scanner;

public class C2_code1 {
	static Scanner scanner = new Scanner(System.in);
	static double r;
	final static double PI = 3.14;

	public double perimeter(double r) {
		return 2 * PI * r;
	}
	
	public double area(double r) {
		return r * PI * r;
	}
	
	public static void main(String[] args) {
		C2_code1 c = new C2_code1();
		System.out.print("请输入圆的半径：");
		r = scanner.nextDouble();
		System.out.println("该圆的半径为：" + r);
		System.out.println("该圆的周长为：" + c.perimeter(r));
		System.out.println("该圆的半径为：" + c.area(r));

	}

}
