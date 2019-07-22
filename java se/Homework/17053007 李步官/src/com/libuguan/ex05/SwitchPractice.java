package com.libuguan.ex05;
import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("请输入1~7的数字，表示一周的天数，判断是否为工作日:");
		int weekDay = input.nextInt();
		switch(weekDay) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("该日为工作日，好好工作吧！");break;
		case 6:
		case 7:
			System.out.println("该日为休息日，好好放松一下自己吧！");
			break;
			default:
				System.out.println("输入错误，请重新输入！");
		}

	}

}
