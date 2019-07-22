package com.libuguan.ex07;

public class ArrayEx01 {

	public static void main(String[] args) {
		int [][] arr = new int [3][4];
		System.out.println(arr);
		System.out.println("输出二维数组的长度：" + arr.length);
		
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.println(arr[2] + " ");

		System.out.println("打印第一个一维数组的元素值");
		System.out.print(arr[0][0] + " ");
		System.out.print(arr[0][1] + " ");
		System.out.print(arr[0][2] + " ");
		System.out.println(arr[0][3] + " ");
		
		System.out.println("打印第二个一维数组的元素值");
		System.out.print(arr[1][0] + " ");
		System.out.print(arr[1][1] + " ");
		System.out.print(arr[1][2] + " ");
		System.out.println(arr[1][3] + " ");
		
		System.out.println("打印第三个一维数组的元素值");
		System.out.print(arr[2][0] + " ");
		System.out.print(arr[2][1] + " ");
		System.out.print(arr[2][2] + " ");
		System.out.println(arr[2][3] + " ");
		
		
		

	}

}
