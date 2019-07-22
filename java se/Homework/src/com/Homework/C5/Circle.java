//Circle类
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
		System.out.println("圆的半径为：" + radius);
		System.out.println("圆的面积为：" + getArea());
		System.out.println("圆的周长为：" + getPerimeter());
	}

}
