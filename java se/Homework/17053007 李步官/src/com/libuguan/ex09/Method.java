package com.libuguan.ex09;

public class Method {

	public static void main(String[] args) {
		int sum1 = add01(1,2);
		int sum2 = add02(1,2,3);
		double sum3 = add03(0.1,0.3);
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("sum3 = " + sum3);

	}

	private static double add03(double d, double e) {
		// TODO �Զ����ɵķ������
		return d + e;
	}

	private static int add02(int i, int j, int k) {
		// TODO �Զ����ɵķ������
		return i + j + k;
	}

	private static int add01(int i, int j) {
		// TODO �Զ����ɵķ������
		return i + j;
	}

}
