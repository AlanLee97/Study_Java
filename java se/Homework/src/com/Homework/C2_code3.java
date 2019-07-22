package com.Homework;
import java.util.Scanner;

public class C2_code3 {
	static int x, x1, x2, x3, x4;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		C2_code3 c = new C2_code3();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个四位数：");
		x = input.nextInt();

		if(x < 999 || x > 9999) {
			System.out.println("你输入的不是四位数字！！请重新输入！");
		}else {
			x1 = ((x / 1000) + 5) % 10;					//获取千位
			x2 = ((x % 1000) / 100 + 5) % 10;			//获取百位
			x3 = (((x % 1000) % 100) / 10 + 5) % 10;	//获取十位
			x4 = ((((x % 1000) % 100) % 10) + 5) % 10;  //获取个位
			int[] arr = {x1, x2, x3, x4};				//用数组储存这四个数
			for(int i = 0, j = 3; i < j ; i++, j--) {	//交换位置
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		}
		System.out.println("加密后的数字为：");
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i]);
		}
		}
		

	}

}
