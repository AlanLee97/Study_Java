//Cylinder类
package com.Homework.C5;

public class Cylinder extends Circle {
	private double hight;
	Cylinder(int r , int h){
		super(r);//调用父类的构造设置半径 
		hight = h;
	}
	
	double getVolume() {
		return getArea() * hight;
	}
	
	void showVolume() {
		System.out.println("圆柱体的体积为：" + getVolume());
	}

}
