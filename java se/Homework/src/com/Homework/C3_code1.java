package com.Homework;
import java.util.Scanner;

public class C3_code1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个十进制的数字：");
		int InputNum = input.nextInt();
		int CalNum = InputNum;
		String str = "";
		do {
			int div = CalNum / 2;
			int mod = CalNum % 2;
			CalNum = div;
			str = mod + str;
		}while(CalNum != 0);
		System.out.println(InputNum + "的二进制数为：" + str);
		

	}

}
