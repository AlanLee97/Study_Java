package com.Homework.C6;
import java.util.Scanner;

public class CalAverageScore {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum = 0;
		int score = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("您要输入多少个数字：");
		num = input.nextInt();
		int[] arr = new int[num];
		int average = 0;
		System.out.println("请输入分数：");
		for(int i = 0; i < num; i++) {
			arr[i] = input.nextInt();
			try {
				if(arr[i] < 0) {
					throw new Exception("输入的分数不能为负数。");
				}
				sum += arr[i];
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		average = sum / num;
		System.out.println("你输入的总数的平均分为：" + average);
	}
}
