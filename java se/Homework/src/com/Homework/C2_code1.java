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
		System.out.print("������Բ�İ뾶��");
		r = scanner.nextDouble();
		System.out.println("��Բ�İ뾶Ϊ��" + r);
		System.out.println("��Բ���ܳ�Ϊ��" + c.perimeter(r));
		System.out.println("��Բ�İ뾶Ϊ��" + c.area(r));

	}

}
