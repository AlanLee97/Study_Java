package com.libuguan.ex08;

public class ArrayEx02 {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		System.out.println("这个数组为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +  " ");
			sum += arr[i];
		}
		System.out.println("\n数组之和为：" + sum);
		
		int [][] arr2 = {{1,2},{3,4,5},{6,7,8,9,10}};
		int sum2 = 0;
		System.out.println("这个数组为：");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
				sum2 += arr2[i][j];
			}
		}
		System.out.println("\n数组之和为：" + sum2);
		

	}

}
