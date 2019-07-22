//Triangle.java
package com.Homework.C6;
import java.util.Scanner;

public class Triangle {
	int a = 0,b = 0,c = 0;
	public void isTriangle(int a, int b, int c) throws IllegalArgumentException {
		boolean temp1 = false;
		boolean temp2 = false;
		if(a < 0 || b < 0 || c < 0) {
			temp1 = false;
		}
		if((a + b) < c || (a + c) < b || (b + c) < a) {
			temp2 = false;
		}
		if(temp1 == false || temp2 == false) {
			throw new IllegalArgumentException("a,b,c不能构成三角形。");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三角形的三条边a,b,c：");
		int a = 0;
		int b = 0;
		int c = 0;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		Triangle t = new Triangle();
		try {
			t.isTriangle(a, b, c);
			System.out.println("这三条边可以构成三角形！");
		} catch (IllegalArgumentException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
