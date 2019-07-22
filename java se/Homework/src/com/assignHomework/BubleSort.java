package com.assignHomework;

public class BubleSort {

	public static void main(String[] args) {
		int i = 0 , j = 0;
		int[] a = {1,3,2,7,5};
		
		System.out.print("数组为：" );
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("\n\n从小到大排序：" );
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
