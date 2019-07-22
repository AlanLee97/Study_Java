package com.Homework;

public class C3_code2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i, j;
		
		int addOfOuter = 0;//存储外层循环值的和
		for(i = 1; i <= 100; i++) {//外层循环计算∑1+∑2+……+∑100值的和
			int addOfInner = 0;	//存储内层循环值的和
			for(j = 1; j <= i; j++) {//计算每一项的和
				addOfInner += j;
			}
			addOfOuter += addOfInner; 
		}
		System.out.println("∑1+∑2+……+∑100 = " + addOfOuter);

	}

}
