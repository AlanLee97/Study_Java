package com.nibuguai;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte mybyte=127;
		int myint=150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte����float�ͽ���������Ϊ��"+(mybyte+myfloat));
		System.out.println("byte����int�ͽ���������Ϊ��"+(mybyte+myint));
		System.out.println("byte����char�ͽ���������Ϊ��"+(mybyte+mychar));
		System.out.println("double����char�ͽ���������Ϊ��"+(mydouble+mychar));
		
	}

}
