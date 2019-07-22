package com.libuguan.ex04;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int randomNumber = new Random().nextInt(100);
		System.out.println("\n已生成100个随机数。");
		
		System.out.println("\n=========请输入你要猜的数字：=========");
		Scanner input = new Scanner(System.in);
		int enterNumber = input.nextInt();
		
		while(enterNumber != randomNumber) {
			if(enterNumber > randomNumber) {
				System.out.println("sorry!你猜的数字大了。请继续猜。");
			}else {
				System.out.println("sorry!你猜的数字小了。请继续猜。");
			}
			System.out.println("请输入你要猜的数字：");
			enterNumber = input.nextInt();
			
		}
		System.out.println("恭喜你，猜对啦！");

	}

}
