//Cylinder��
package com.Homework.C5;

public class Cylinder extends Circle {
	private double hight;
	Cylinder(int r , int h){
		super(r);//���ø���Ĺ������ð뾶 
		hight = h;
	}
	
	double getVolume() {
		return getArea() * hight;
	}
	
	void showVolume() {
		System.out.println("Բ��������Ϊ��" + getVolume());
	}

}
