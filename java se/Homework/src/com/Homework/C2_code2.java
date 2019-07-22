package com.Homework;

public class C2_code2 {

	public static final int Principal = 10000;
	static double current1 = 0.0035;
	static double current2 = 0.0035 * 2.0;
	static double regular1 = 0.0150;
	static double regular2 = 0.0210 * 2.0;
	int culCurrent() {
		return (int)(Principal + Principal * current1);
	}

	public static void main(String[] args) {
		
		C2_code2 c = new C2_code2();
		
		System.out.println("本金：" + Principal);
		System.out.println("活期1年本金总计：" + Math.round(Principal * (1.0 + current1)));
		System.out.println("定期1年本金总计：" + Math.round(Principal * (1.0 + regular1)));
		System.out.println("活期2年本金总计：" + Math.round(Principal * (1.0 + current2)));
		System.out.println("定期2年本金总计：" + Math.round(Principal * (1.0 + regular2)));

	}
}
