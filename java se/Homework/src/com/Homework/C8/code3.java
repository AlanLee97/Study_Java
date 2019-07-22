package com.Homework.C8;

enum Signal{red,yellow,green}

public class code3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Signal s = Signal.red;
		switch(s) {
		case red:
			System.out.println("停车");
			break;
		case green:
			System.out.println("行驶");
			break;
		case yellow:
			System.out.println("慢行");
			break;
			
		}

	}

}
