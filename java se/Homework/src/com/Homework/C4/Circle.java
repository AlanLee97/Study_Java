package com.Homework.C4;

public class Circle {
	double r;
	Circle(double r){
		this.r = r;
	}
	double getArea() {
		return Math.PI * r * r;
	}
	double getPerimeter() {
		return 2 * Math.PI * r;
		//return Math.round(2 * Math.PI * r);
	}

	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println("Բ�����Ϊ��" + c.getArea());
		System.out.println("Բ���ܳ�Ϊ��" + c.getPerimeter());
	}

}
