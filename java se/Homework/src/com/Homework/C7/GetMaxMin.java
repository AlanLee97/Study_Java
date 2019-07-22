package com.Homework.C7;

import java.util.Random;

public class GetMaxMin {
	static int count;
	static int[] a = new int[101];
	
	public static void main(String[] args) {
		GetMaxMin gmm = new GetMaxMin();
		System.out.println("当前存放随机数的数组为：");
		gmm.createRandomNum(100);
		gmm.InitArray(50);
		System.out.println("\n数组中最大值为：" + gmm.getMax(a) + 
				"\n最小值为：" + gmm.getMin(a));
		System.out.println("数组中大于等于60的数有" + gmm.countNum(a) + "个。");
		
	}
	
	//生存随机数的函数
	int createRandomNum(int n) {
		int randomNum = (int)Math.round(Math.random() * n);
		//int randomNum = new Random().nextInt(n);   //另一种生成随机数的方法
		return randomNum;
	}
	
	//将随机数放入数组
	void InitArray(int sum) {
		int tempCount = 0;
		for(int i = 0 ; i < sum; i++) {
			a[i] = createRandomNum(100);
		}
		for(int i = 0; i < 50; i++) {
			
			System.out.print(a[i] + " ");
			tempCount++;
		}
		System.out.println("\n生成了" + tempCount + "个随机数。");
		
	}
	
	//使用选择排序法进行从大到小排序
	int getMax(int[] a) {
		int max;
		for(int i = 0; i < a.length -1; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return max = a[0];  //输出第一个值（最大值）
	}
	
	//同理
	int getMin(int[] a) {
		int min;
		for(int i = 0; i < a.length -1; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return min = a[0];
	}
	
	//统计大于等于60的数有多少个
	int countNum(int[] a) {
		for(int i : a) {
			if(a[i] >= 60)
				count++;
		}
		return count;
	}
	
}
