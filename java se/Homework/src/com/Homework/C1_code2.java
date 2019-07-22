package com.Homework;

public class C1_code2 {
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i < 5; i++) {		//外层循坏控制行
			for(j = 1; j <= i; j++) {	//内层循环控制列
				System.out.print(j + "*" + i + "=" + i * j + " ");
				if(i == j) {
					System.out.println();	//控制换行
				}
			}
		}
	}

}
