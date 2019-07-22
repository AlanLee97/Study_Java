package com.Homework;

public class C3_code3 {

	public static void main(String[] args) {
		int i;
		long a[] = new long[50];
		a[0] = 1;
		a[1] = 1;
		for(i = 2; i <= 40; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		for(int j = 0; j < 40; j++)
			System.out.print(a[j] + " ");
		System.out.println("\n数列的第40位数是：" + a[39]);

	}
	

}
