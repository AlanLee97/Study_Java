//Circle��
package com.Homework.C5;

public class Circle {
	private double radius;
	Circle(){}
	Circle(int r){radius = r;}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	void show() {
		System.out.println("Բ�İ뾶Ϊ��" + radius);
		System.out.println("Բ�����Ϊ��" + getArea());
		System.out.println("Բ���ܳ�Ϊ��" + getPerimeter());
	}

}
